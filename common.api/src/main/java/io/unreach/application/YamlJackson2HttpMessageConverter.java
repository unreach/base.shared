package io.unreach.application;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

final class YamlJackson2HttpMessageConverter extends AbstractJackson2HttpMessageConverter {

  static YAMLMapper yamlMapper = new YAMLMapper();

  static {
    yamlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  YamlJackson2HttpMessageConverter() {
    super(yamlMapper, MediaType.parseMediaType("application/x-yaml"));
  }
}
