/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package sparqles.analytics.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IndexViewDiscoverabilityDataValues extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndexViewDiscoverabilityDataValues\",\"namespace\":\"sparqles.analytics.avro\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence label;
  @Deprecated public double value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public IndexViewDiscoverabilityDataValues() {}

  /**
   * All-args constructor.
   */
  public IndexViewDiscoverabilityDataValues(java.lang.CharSequence label, java.lang.Double value) {
    this.label = label;
    this.value = value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return label;
    case 1: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: label = (java.lang.CharSequence)value$; break;
    case 1: value = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'label' field.
   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Double value) {
    this.value = value;
  }

  /** Creates a new IndexViewDiscoverabilityDataValues RecordBuilder */
  public static sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder newBuilder() {
    return new sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder();
  }
  
  /** Creates a new IndexViewDiscoverabilityDataValues RecordBuilder by copying an existing Builder */
  public static sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder newBuilder(sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder other) {
    return new sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder(other);
  }
  
  /** Creates a new IndexViewDiscoverabilityDataValues RecordBuilder by copying an existing IndexViewDiscoverabilityDataValues instance */
  public static sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder newBuilder(sparqles.analytics.avro.IndexViewDiscoverabilityDataValues other) {
    return new sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder(other);
  }
  
  /**
   * RecordBuilder for IndexViewDiscoverabilityDataValues instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IndexViewDiscoverabilityDataValues>
    implements org.apache.avro.data.RecordBuilder<IndexViewDiscoverabilityDataValues> {

    private java.lang.CharSequence label;
    private double value;

    /** Creates a new Builder */
    private Builder() {
      super(sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing IndexViewDiscoverabilityDataValues instance */
    private Builder(sparqles.analytics.avro.IndexViewDiscoverabilityDataValues other) {
            super(sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.SCHEMA$);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.label = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'label' field */
    public sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder clearLabel() {
      label = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.Double getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder setValue(double value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'value' field */
    public sparqles.analytics.avro.IndexViewDiscoverabilityDataValues.Builder clearValue() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public IndexViewDiscoverabilityDataValues build() {
      try {
        IndexViewDiscoverabilityDataValues record = new IndexViewDiscoverabilityDataValues();
        record.label = fieldSetFlags()[0] ? this.label : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
