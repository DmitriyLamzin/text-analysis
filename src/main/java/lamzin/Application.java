package lamzin;

import lamzin.entity.JsonResponse;
import lamzin.entity.Review;
import lamzin.service.Analyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Analyzer analyzer() {
		return new Analyzer();
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			JsonResponse quote = restTemplate.getForObject(
							"https://api.trustedshops.com/rest/public/v2/shops/X943E74C50230B6DE76F473502940BB91/reviews.json", JsonResponse.class);
			log.info(quote.toString());

			List<Review> reviews = quote.getResponse().getData().getShop().getReviews();

			reviews.stream().filter(review -> analyzer().isNameTagged(review.getComment())).forEach(review ->
				log.info("the message contains name: " + review.getComment()));
		};
	}
}