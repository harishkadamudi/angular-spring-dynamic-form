package ffg.harish.dynamicforms.model;

import ffg.harish.dynamicforms.converter.HashMapToStringConverter;

import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Add extra fields to a given jpa entity
 * Created by Harish Kadamudi on 26/02/2016.
 */
@MappedSuperclass
@SuppressWarnings("unchecked")
public abstract class FieldExtensible implements Serializable {

    @Lob
    private String extraFields;

    /**
     * Get extra fields
     * @return HashMap with extra fields key and value
     */
    public Map<String, String> getExtraFields() {
        return HashMapToStringConverter.getInstance().convertToEntityAttribute(extraFields);
    }

    /**
     * Set extra fields
     * @param extraFields set HashMap extra fields
     */
    public void setExtraFields(Map<String, String> extraFields) {
        this.extraFields = HashMapToStringConverter.getInstance().convertToDatabaseColumn((HashMap) extraFields);
    }
}
