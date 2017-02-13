package lamzin.service;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class Analyzer {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public boolean isNameTagged(String tesxt) {
    Annotation germanAnnotation = new Annotation(tesxt);
    Properties germanProperties = StringUtils.argsToProperties(
            new String[]{"-props", "StanfordCoreNLP-german.properties"});
    StanfordCoreNLP pipeline = new StanfordCoreNLP(germanProperties);
    pipeline.annotate(germanAnnotation);
    String tag = germanAnnotation.get(CoreAnnotations.NamedEntityTagAnnotation.class);
    for (CoreLabel label : germanAnnotation.get(CoreAnnotations.TokensAnnotation.class)) {
      logger.info("core label " + label.get(CoreAnnotations.NamedEntityTagAnnotation.class));
      if (label.get(CoreAnnotations.NamedEntityTagAnnotation.class).equalsIgnoreCase("I-PER")) {
        return true;
      }
    }
    return false;
  }
}
