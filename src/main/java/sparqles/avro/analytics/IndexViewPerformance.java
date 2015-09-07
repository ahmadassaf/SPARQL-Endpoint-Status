/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package sparqles.avro.analytics;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IndexViewPerformance extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndexViewPerformance\",\"namespace\":\"sparqles.avro.analytics\",\"fields\":[{\"name\":\"threshold\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewPerformanceData\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"color\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewPerformanceDataValues\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long threshold;
  @Deprecated public java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public IndexViewPerformance() {}

  /**
   * All-args constructor.
   */
  public IndexViewPerformance(java.lang.Long threshold, java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> data) {
    this.threshold = threshold;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return threshold;
    case 1: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: threshold = (java.lang.Long)value$; break;
    case 1: data = (java.util.List<sparqles.avro.analytics.IndexViewPerformanceData>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'threshold' field.
   */
  public java.lang.Long getThreshold() {
    return threshold;
  }

  /**
   * Sets the value of the 'threshold' field.
   * @param value the value to set.
   */
  public void setThreshold(java.lang.Long value) {
    this.threshold = value;
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> value) {
    this.data = value;
  }

  /** Creates a new IndexViewPerformance RecordBuilder */
  public static sparqles.avro.analytics.IndexViewPerformance.Builder newBuilder() {
    return new sparqles.avro.analytics.IndexViewPerformance.Builder();
  }
  
  /** Creates a new IndexViewPerformance RecordBuilder by copying an existing Builder */
  public static sparqles.avro.analytics.IndexViewPerformance.Builder newBuilder(sparqles.avro.analytics.IndexViewPerformance.Builder other) {
    return new sparqles.avro.analytics.IndexViewPerformance.Builder(other);
  }
  
  /** Creates a new IndexViewPerformance RecordBuilder by copying an existing IndexViewPerformance instance */
  public static sparqles.avro.analytics.IndexViewPerformance.Builder newBuilder(sparqles.avro.analytics.IndexViewPerformance other) {
    return new sparqles.avro.analytics.IndexViewPerformance.Builder(other);
  }
  
  /**
   * RecordBuilder for IndexViewPerformance instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IndexViewPerformance>
    implements org.apache.avro.data.RecordBuilder<IndexViewPerformance> {

    private long threshold;
    private java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> data;

    /** Creates a new Builder */
    private Builder() {
      super(sparqles.avro.analytics.IndexViewPerformance.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(sparqles.avro.analytics.IndexViewPerformance.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.threshold)) {
        this.threshold = data().deepCopy(fields()[0].schema(), other.threshold);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing IndexViewPerformance instance */
    private Builder(sparqles.avro.analytics.IndexViewPerformance other) {
            super(sparqles.avro.analytics.IndexViewPerformance.SCHEMA$);
      if (isValidValue(fields()[0], other.threshold)) {
        this.threshold = data().deepCopy(fields()[0].schema(), other.threshold);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'threshold' field */
    public java.lang.Long getThreshold() {
      return threshold;
    }
    
    /** Sets the value of the 'threshold' field */
    public sparqles.avro.analytics.IndexViewPerformance.Builder setThreshold(long value) {
      validate(fields()[0], value);
      this.threshold = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'threshold' field has been set */
    public boolean hasThreshold() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'threshold' field */
    public sparqles.avro.analytics.IndexViewPerformance.Builder clearThreshold() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'data' field */
    public java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public sparqles.avro.analytics.IndexViewPerformance.Builder setData(java.util.List<sparqles.avro.analytics.IndexViewPerformanceData> value) {
      validate(fields()[1], value);
      this.data = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'data' field */
    public sparqles.avro.analytics.IndexViewPerformance.Builder clearData() {
      data = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public IndexViewPerformance build() {
      try {
        IndexViewPerformance record = new IndexViewPerformance();
        record.threshold = fieldSetFlags()[0] ? this.threshold : (java.lang.Long) defaultValue(fields()[0]);
        record.data = fieldSetFlags()[1] ? this.data : (java.util.List<sparqles.avro.analytics.IndexViewPerformanceData>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
