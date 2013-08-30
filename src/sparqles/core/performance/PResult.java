/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package sparqles.core.performance;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PResult extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PResult\",\"namespace\":\"sparqles.core.performance\",\"fields\":[{\"name\":\"endpointResult\",\"type\":{\"type\":\"record\",\"name\":\"EndpointResult\",\"namespace\":\"sparqles.core\",\"fields\":[{\"name\":\"endpoint\",\"type\":{\"type\":\"record\",\"name\":\"Endpoint\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"}]}},{\"name\":\"start\",\"type\":\"long\"},{\"name\":\"end\",\"type\":\"long\"}],\"imports\":[\"Endpoint.avsc\"]}},{\"name\":\"results\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"PSingleResult\",\"fields\":[{\"name\":\"query\",\"type\":\"string\"},{\"name\":\"cold\",\"type\":{\"type\":\"record\",\"name\":\"Run\",\"fields\":[{\"name\":\"frestout\",\"type\":\"long\"},{\"name\":\"solutions\",\"type\":\"int\"},{\"name\":\"inittime\",\"type\":\"long\"},{\"name\":\"exectime\",\"type\":\"long\"},{\"name\":\"closetime\",\"type\":\"long\"},{\"name\":\"Exception\",\"type\":[\"string\",\"null\"]},{\"name\":\"exectout\",\"type\":\"long\"}]}},{\"name\":\"warm\",\"type\":\"Run\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public sparqles.core.EndpointResult endpointResult;
  @Deprecated public java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> results;

  /**
   * Default constructor.
   */
  public PResult() {}

  /**
   * All-args constructor.
   */
  public PResult(sparqles.core.EndpointResult endpointResult, java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> results) {
    this.endpointResult = endpointResult;
    this.results = results;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return endpointResult;
    case 1: return results;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: endpointResult = (sparqles.core.EndpointResult)value$; break;
    case 1: results = (java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'endpointResult' field.
   */
  public sparqles.core.EndpointResult getEndpointResult() {
    return endpointResult;
  }

  /**
   * Sets the value of the 'endpointResult' field.
   * @param value the value to set.
   */
  public void setEndpointResult(sparqles.core.EndpointResult value) {
    this.endpointResult = value;
  }

  /**
   * Gets the value of the 'results' field.
   */
  public java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> getResults() {
    return results;
  }

  /**
   * Sets the value of the 'results' field.
   * @param value the value to set.
   */
  public void setResults(java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> value) {
    this.results = value;
  }

  /** Creates a new PResult RecordBuilder */
  public static sparqles.core.performance.PResult.Builder newBuilder() {
    return new sparqles.core.performance.PResult.Builder();
  }
  
  /** Creates a new PResult RecordBuilder by copying an existing Builder */
  public static sparqles.core.performance.PResult.Builder newBuilder(sparqles.core.performance.PResult.Builder other) {
    return new sparqles.core.performance.PResult.Builder(other);
  }
  
  /** Creates a new PResult RecordBuilder by copying an existing PResult instance */
  public static sparqles.core.performance.PResult.Builder newBuilder(sparqles.core.performance.PResult other) {
    return new sparqles.core.performance.PResult.Builder(other);
  }
  
  /**
   * RecordBuilder for PResult instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PResult>
    implements org.apache.avro.data.RecordBuilder<PResult> {

    private sparqles.core.EndpointResult endpointResult;
    private java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> results;

    /** Creates a new Builder */
    private Builder() {
      super(sparqles.core.performance.PResult.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(sparqles.core.performance.PResult.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PResult instance */
    private Builder(sparqles.core.performance.PResult other) {
            super(sparqles.core.performance.PResult.SCHEMA$);
      if (isValidValue(fields()[0], other.endpointResult)) {
        this.endpointResult = data().deepCopy(fields()[0].schema(), other.endpointResult);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.results)) {
        this.results = data().deepCopy(fields()[1].schema(), other.results);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'endpointResult' field */
    public sparqles.core.EndpointResult getEndpointResult() {
      return endpointResult;
    }
    
    /** Sets the value of the 'endpointResult' field */
    public sparqles.core.performance.PResult.Builder setEndpointResult(sparqles.core.EndpointResult value) {
      validate(fields()[0], value);
      this.endpointResult = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'endpointResult' field has been set */
    public boolean hasEndpointResult() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'endpointResult' field */
    public sparqles.core.performance.PResult.Builder clearEndpointResult() {
      endpointResult = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'results' field */
    public java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> getResults() {
      return results;
    }
    
    /** Sets the value of the 'results' field */
    public sparqles.core.performance.PResult.Builder setResults(java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult> value) {
      validate(fields()[1], value);
      this.results = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'results' field has been set */
    public boolean hasResults() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'results' field */
    public sparqles.core.performance.PResult.Builder clearResults() {
      results = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public PResult build() {
      try {
        PResult record = new PResult();
        record.endpointResult = fieldSetFlags()[0] ? this.endpointResult : (sparqles.core.EndpointResult) defaultValue(fields()[0]);
        record.results = fieldSetFlags()[1] ? this.results : (java.util.Map<java.lang.CharSequence,sparqles.core.performance.PSingleResult>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}