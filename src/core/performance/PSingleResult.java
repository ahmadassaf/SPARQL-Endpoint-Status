/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package core.performance;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PSingleResult extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PSingleResult\",\"namespace\":\"core.performance\",\"fields\":[{\"name\":\"query\",\"type\":\"string\"},{\"name\":\"cold\",\"type\":{\"type\":\"record\",\"name\":\"Run\",\"fields\":[{\"name\":\"frestout\",\"type\":\"long\"},{\"name\":\"solutions\",\"type\":\"int\"},{\"name\":\"inittime\",\"type\":\"long\"},{\"name\":\"exectime\",\"type\":\"long\"},{\"name\":\"closetime\",\"type\":\"long\"},{\"name\":\"Exception\",\"type\":[\"string\",\"null\"]},{\"name\":\"exectout\",\"type\":\"long\"}]}},{\"name\":\"warm\",\"type\":\"Run\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence query;
  @Deprecated public core.performance.Run cold;
  @Deprecated public core.performance.Run warm;

  /**
   * Default constructor.
   */
  public PSingleResult() {}

  /**
   * All-args constructor.
   */
  public PSingleResult(java.lang.CharSequence query, core.performance.Run cold, core.performance.Run warm) {
    this.query = query;
    this.cold = cold;
    this.warm = warm;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return query;
    case 1: return cold;
    case 2: return warm;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: query = (java.lang.CharSequence)value$; break;
    case 1: cold = (core.performance.Run)value$; break;
    case 2: warm = (core.performance.Run)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'query' field.
   */
  public java.lang.CharSequence getQuery() {
    return query;
  }

  /**
   * Sets the value of the 'query' field.
   * @param value the value to set.
   */
  public void setQuery(java.lang.CharSequence value) {
    this.query = value;
  }

  /**
   * Gets the value of the 'cold' field.
   */
  public core.performance.Run getCold() {
    return cold;
  }

  /**
   * Sets the value of the 'cold' field.
   * @param value the value to set.
   */
  public void setCold(core.performance.Run value) {
    this.cold = value;
  }

  /**
   * Gets the value of the 'warm' field.
   */
  public core.performance.Run getWarm() {
    return warm;
  }

  /**
   * Sets the value of the 'warm' field.
   * @param value the value to set.
   */
  public void setWarm(core.performance.Run value) {
    this.warm = value;
  }

  /** Creates a new PSingleResult RecordBuilder */
  public static core.performance.PSingleResult.Builder newBuilder() {
    return new core.performance.PSingleResult.Builder();
  }
  
  /** Creates a new PSingleResult RecordBuilder by copying an existing Builder */
  public static core.performance.PSingleResult.Builder newBuilder(core.performance.PSingleResult.Builder other) {
    return new core.performance.PSingleResult.Builder(other);
  }
  
  /** Creates a new PSingleResult RecordBuilder by copying an existing PSingleResult instance */
  public static core.performance.PSingleResult.Builder newBuilder(core.performance.PSingleResult other) {
    return new core.performance.PSingleResult.Builder(other);
  }
  
  /**
   * RecordBuilder for PSingleResult instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PSingleResult>
    implements org.apache.avro.data.RecordBuilder<PSingleResult> {

    private java.lang.CharSequence query;
    private core.performance.Run cold;
    private core.performance.Run warm;

    /** Creates a new Builder */
    private Builder() {
      super(core.performance.PSingleResult.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(core.performance.PSingleResult.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PSingleResult instance */
    private Builder(core.performance.PSingleResult other) {
            super(core.performance.PSingleResult.SCHEMA$);
      if (isValidValue(fields()[0], other.query)) {
        this.query = data().deepCopy(fields()[0].schema(), other.query);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cold)) {
        this.cold = data().deepCopy(fields()[1].schema(), other.cold);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.warm)) {
        this.warm = data().deepCopy(fields()[2].schema(), other.warm);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'query' field */
    public java.lang.CharSequence getQuery() {
      return query;
    }
    
    /** Sets the value of the 'query' field */
    public core.performance.PSingleResult.Builder setQuery(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.query = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'query' field has been set */
    public boolean hasQuery() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'query' field */
    public core.performance.PSingleResult.Builder clearQuery() {
      query = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'cold' field */
    public core.performance.Run getCold() {
      return cold;
    }
    
    /** Sets the value of the 'cold' field */
    public core.performance.PSingleResult.Builder setCold(core.performance.Run value) {
      validate(fields()[1], value);
      this.cold = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'cold' field has been set */
    public boolean hasCold() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'cold' field */
    public core.performance.PSingleResult.Builder clearCold() {
      cold = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'warm' field */
    public core.performance.Run getWarm() {
      return warm;
    }
    
    /** Sets the value of the 'warm' field */
    public core.performance.PSingleResult.Builder setWarm(core.performance.Run value) {
      validate(fields()[2], value);
      this.warm = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'warm' field has been set */
    public boolean hasWarm() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'warm' field */
    public core.performance.PSingleResult.Builder clearWarm() {
      warm = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public PSingleResult build() {
      try {
        PSingleResult record = new PSingleResult();
        record.query = fieldSetFlags()[0] ? this.query : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.cold = fieldSetFlags()[1] ? this.cold : (core.performance.Run) defaultValue(fields()[1]);
        record.warm = fieldSetFlags()[2] ? this.warm : (core.performance.Run) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
