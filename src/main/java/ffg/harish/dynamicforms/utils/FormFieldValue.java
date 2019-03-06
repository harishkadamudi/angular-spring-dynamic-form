package ffg.harish.dynamicforms.utils;

/**
 * Form field value
 * Created by Harish Kadamudi on 25/02/2016.
 */
public class FormFieldValue {

    private String value;
    private String defaultValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}