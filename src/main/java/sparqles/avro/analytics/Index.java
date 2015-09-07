/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package sparqles.avro.analytics;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Index extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Index\",\"namespace\":\"sparqles.avro.analytics\",\"fields\":[{\"name\":\"endpoint\",\"type\":{\"type\":\"record\",\"name\":\"Endpoint\",\"namespace\":\"sparqles.avro\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"datasets\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Dataset\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"label\",\"type\":\"string\"}]}}}]}},{\"name\":\"lastUpdate\",\"type\":\"long\"},{\"name\":\"availability\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvailabilityIndex\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexAvailabilityDataPoint\",\"fields\":[{\"name\":\"x\",\"type\":\"string\"},{\"name\":\"y\",\"type\":\"double\"}]}}}]}}},{\"name\":\"performance\",\"type\":{\"type\":\"record\",\"name\":\"IndexViewPerformance\",\"fields\":[{\"name\":\"threshold\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewPerformanceData\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"color\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewPerformanceDataValues\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}}}]}}}]}},{\"name\":\"interoperability\",\"type\":{\"type\":\"record\",\"name\":\"IndexViewInteroperability\",\"fields\":[{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewInterData\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"color\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewInterDataValues\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}}}]}}}]}},{\"name\":\"discoverability\",\"type\":{\"type\":\"record\",\"name\":\"IndexViewDiscoverability\",\"fields\":[{\"name\":\"serverName\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewDiscoverabilityData\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexViewDiscoverabilityDataValues\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}}}]}}},{\"name\":\"VoIDDescription\",\"type\":\"double\"},{\"name\":\"SDDescription\",\"type\":\"double\"},{\"name\":\"NoDescription\",\"type\":\"double\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public sparqles.avro.Endpoint endpoint;
  @Deprecated public long lastUpdate;
  @Deprecated public java.util.List<sparqles.avro.analytics.AvailabilityIndex> availability;
  @Deprecated public sparqles.avro.analytics.IndexViewPerformance performance;
  @Deprecated public sparqles.avro.analytics.IndexViewInteroperability interoperability;
  @Deprecated public sparqles.avro.analytics.IndexViewDiscoverability discoverability;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public Index() {}

  /**
   * All-args constructor.
   */
  public Index(sparqles.avro.Endpoint endpoint, java.lang.Long lastUpdate, java.util.List<sparqles.avro.analytics.AvailabilityIndex> availability, sparqles.avro.analytics.IndexViewPerformance performance, sparqles.avro.analytics.IndexViewInteroperability interoperability, sparqles.avro.analytics.IndexViewDiscoverability discoverability) {
    this.endpoint = endpoint;
    this.lastUpdate = lastUpdate;
    this.availability = availability;
    this.performance = performance;
    this.interoperability = interoperability;
    this.discoverability = discoverability;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return endpoint;
    case 1: return lastUpdate;
    case 2: return availability;
    case 3: return performance;
    case 4: return interoperability;
    case 5: return discoverability;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: endpoint = (sparqles.avro.Endpoint)value$; break;
    case 1: lastUpdate = (java.lang.Long)value$; break;
    case 2: availability = (java.util.List<sparqles.avro.analytics.AvailabilityIndex>)value$; break;
    case 3: performance = (sparqles.avro.analytics.IndexViewPerformance)value$; break;
    case 4: interoperability = (sparqles.avro.analytics.IndexViewInteroperability)value$; break;
    case 5: discoverability = (sparqles.avro.analytics.IndexViewDiscoverability)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'endpoint' field.
   */
  public sparqles.avro.Endpoint getEndpoint() {
    return endpoint;
  }

  /**
   * Sets the value of the 'endpoint' field.
   * @param value the value to set.
   */
  public void setEndpoint(sparqles.avro.Endpoint value) {
    this.endpoint = value;
  }

  /**
   * Gets the value of the 'lastUpdate' field.
   */
  public java.lang.Long getLastUpdate() {
    return lastUpdate;
  }

  /**
   * Sets the value of the 'lastUpdate' field.
   * @param value the value to set.
   */
  public void setLastUpdate(java.lang.Long value) {
    this.lastUpdate = value;
  }

  /**
   * Gets the value of the 'availability' field.
   */
  public java.util.List<sparqles.avro.analytics.AvailabilityIndex> getAvailability() {
    return availability;
  }

  /**
   * Sets the value of the 'availability' field.
   * @param value the value to set.
   */
  public void setAvailability(java.util.List<sparqles.avro.analytics.AvailabilityIndex> value) {
    this.availability = value;
  }

  /**
   * Gets the value of the 'performance' field.
   */
  public sparqles.avro.analytics.IndexViewPerformance getPerformance() {
    return performance;
  }

  /**
   * Sets the value of the 'performance' field.
   * @param value the value to set.
   */
  public void setPerformance(sparqles.avro.analytics.IndexViewPerformance value) {
    this.performance = value;
  }

  /**
   * Gets the value of the 'interoperability' field.
   */
  public sparqles.avro.analytics.IndexViewInteroperability getInteroperability() {
    return interoperability;
  }

  /**
   * Sets the value of the 'interoperability' field.
   * @param value the value to set.
   */
  public void setInteroperability(sparqles.avro.analytics.IndexViewInteroperability value) {
    this.interoperability = value;
  }

  /**
   * Gets the value of the 'discoverability' field.
   */
  public sparqles.avro.analytics.IndexViewDiscoverability getDiscoverability() {
    return discoverability;
  }

  /**
   * Sets the value of the 'discoverability' field.
   * @param value the value to set.
   */
  public void setDiscoverability(sparqles.avro.analytics.IndexViewDiscoverability value) {
    this.discoverability = value;
  }

  /** Creates a new Index RecordBuilder */
  public static sparqles.avro.analytics.Index.Builder newBuilder() {
    return new sparqles.avro.analytics.Index.Builder();
  }
  
  /** Creates a new Index RecordBuilder by copying an existing Builder */
  public static sparqles.avro.analytics.Index.Builder newBuilder(sparqles.avro.analytics.Index.Builder other) {
    return new sparqles.avro.analytics.Index.Builder(other);
  }
  
  /** Creates a new Index RecordBuilder by copying an existing Index instance */
  public static sparqles.avro.analytics.Index.Builder newBuilder(sparqles.avro.analytics.Index other) {
    return new sparqles.avro.analytics.Index.Builder(other);
  }
  
  /**
   * RecordBuilder for Index instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Index>
    implements org.apache.avro.data.RecordBuilder<Index> {

    private sparqles.avro.Endpoint endpoint;
    private long lastUpdate;
    private java.util.List<sparqles.avro.analytics.AvailabilityIndex> availability;
    private sparqles.avro.analytics.IndexViewPerformance performance;
    private sparqles.avro.analytics.IndexViewInteroperability interoperability;
    private sparqles.avro.analytics.IndexViewDiscoverability discoverability;

    /** Creates a new Builder */
    private Builder() {
      super(sparqles.avro.analytics.Index.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(sparqles.avro.analytics.Index.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.endpoint)) {
        this.endpoint = data().deepCopy(fields()[0].schema(), other.endpoint);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastUpdate)) {
        this.lastUpdate = data().deepCopy(fields()[1].schema(), other.lastUpdate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.availability)) {
        this.availability = data().deepCopy(fields()[2].schema(), other.availability);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.performance)) {
        this.performance = data().deepCopy(fields()[3].schema(), other.performance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.interoperability)) {
        this.interoperability = data().deepCopy(fields()[4].schema(), other.interoperability);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.discoverability)) {
        this.discoverability = data().deepCopy(fields()[5].schema(), other.discoverability);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Index instance */
    private Builder(sparqles.avro.analytics.Index other) {
            super(sparqles.avro.analytics.Index.SCHEMA$);
      if (isValidValue(fields()[0], other.endpoint)) {
        this.endpoint = data().deepCopy(fields()[0].schema(), other.endpoint);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastUpdate)) {
        this.lastUpdate = data().deepCopy(fields()[1].schema(), other.lastUpdate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.availability)) {
        this.availability = data().deepCopy(fields()[2].schema(), other.availability);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.performance)) {
        this.performance = data().deepCopy(fields()[3].schema(), other.performance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.interoperability)) {
        this.interoperability = data().deepCopy(fields()[4].schema(), other.interoperability);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.discoverability)) {
        this.discoverability = data().deepCopy(fields()[5].schema(), other.discoverability);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'endpoint' field */
    public sparqles.avro.Endpoint getEndpoint() {
      return endpoint;
    }
    
    /** Sets the value of the 'endpoint' field */
    public sparqles.avro.analytics.Index.Builder setEndpoint(sparqles.avro.Endpoint value) {
      validate(fields()[0], value);
      this.endpoint = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'endpoint' field has been set */
    public boolean hasEndpoint() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'endpoint' field */
    public sparqles.avro.analytics.Index.Builder clearEndpoint() {
      endpoint = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'lastUpdate' field */
    public java.lang.Long getLastUpdate() {
      return lastUpdate;
    }
    
    /** Sets the value of the 'lastUpdate' field */
    public sparqles.avro.analytics.Index.Builder setLastUpdate(long value) {
      validate(fields()[1], value);
      this.lastUpdate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'lastUpdate' field has been set */
    public boolean hasLastUpdate() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'lastUpdate' field */
    public sparqles.avro.analytics.Index.Builder clearLastUpdate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'availability' field */
    public java.util.List<sparqles.avro.analytics.AvailabilityIndex> getAvailability() {
      return availability;
    }
    
    /** Sets the value of the 'availability' field */
    public sparqles.avro.analytics.Index.Builder setAvailability(java.util.List<sparqles.avro.analytics.AvailabilityIndex> value) {
      validate(fields()[2], value);
      this.availability = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'availability' field has been set */
    public boolean hasAvailability() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'availability' field */
    public sparqles.avro.analytics.Index.Builder clearAvailability() {
      availability = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'performance' field */
    public sparqles.avro.analytics.IndexViewPerformance getPerformance() {
      return performance;
    }
    
    /** Sets the value of the 'performance' field */
    public sparqles.avro.analytics.Index.Builder setPerformance(sparqles.avro.analytics.IndexViewPerformance value) {
      validate(fields()[3], value);
      this.performance = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'performance' field has been set */
    public boolean hasPerformance() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'performance' field */
    public sparqles.avro.analytics.Index.Builder clearPerformance() {
      performance = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'interoperability' field */
    public sparqles.avro.analytics.IndexViewInteroperability getInteroperability() {
      return interoperability;
    }
    
    /** Sets the value of the 'interoperability' field */
    public sparqles.avro.analytics.Index.Builder setInteroperability(sparqles.avro.analytics.IndexViewInteroperability value) {
      validate(fields()[4], value);
      this.interoperability = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'interoperability' field has been set */
    public boolean hasInteroperability() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'interoperability' field */
    public sparqles.avro.analytics.Index.Builder clearInteroperability() {
      interoperability = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'discoverability' field */
    public sparqles.avro.analytics.IndexViewDiscoverability getDiscoverability() {
      return discoverability;
    }
    
    /** Sets the value of the 'discoverability' field */
    public sparqles.avro.analytics.Index.Builder setDiscoverability(sparqles.avro.analytics.IndexViewDiscoverability value) {
      validate(fields()[5], value);
      this.discoverability = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'discoverability' field has been set */
    public boolean hasDiscoverability() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'discoverability' field */
    public sparqles.avro.analytics.Index.Builder clearDiscoverability() {
      discoverability = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Index build() {
      try {
        Index record = new Index();
        record.endpoint = fieldSetFlags()[0] ? this.endpoint : (sparqles.avro.Endpoint) defaultValue(fields()[0]);
        record.lastUpdate = fieldSetFlags()[1] ? this.lastUpdate : (java.lang.Long) defaultValue(fields()[1]);
        record.availability = fieldSetFlags()[2] ? this.availability : (java.util.List<sparqles.avro.analytics.AvailabilityIndex>) defaultValue(fields()[2]);
        record.performance = fieldSetFlags()[3] ? this.performance : (sparqles.avro.analytics.IndexViewPerformance) defaultValue(fields()[3]);
        record.interoperability = fieldSetFlags()[4] ? this.interoperability : (sparqles.avro.analytics.IndexViewInteroperability) defaultValue(fields()[4]);
        record.discoverability = fieldSetFlags()[5] ? this.discoverability : (sparqles.avro.analytics.IndexViewDiscoverability) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
