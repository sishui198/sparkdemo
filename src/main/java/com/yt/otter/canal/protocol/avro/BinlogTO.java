/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.yt.otter.canal.protocol.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BinlogTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1183671210801855046L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BinlogTO\",\"namespace\":\"com.yt.otter.canal.protocol.avro\",\"fields\":[{\"name\":\"opTiem\",\"type\":\"string\"},{\"name\":\"opType\",\"type\":\"string\"},{\"name\":\"schemaName\",\"type\":\"string\"},{\"name\":\"tableName\",\"type\":\"string\"},{\"name\":\"primary\",\"type\":\"string\"},{\"name\":\"primaryValue\",\"type\":\"string\"},{\"name\":\"changeColumnMap\",\"type\":[{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"ColumnChange\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"value\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"preValue\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"mysqlType\",\"type\":\"string\"}]}},\"null\"],\"default\":null},{\"name\":\"postChangeContent\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ColumnContent\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"isKey\",\"type\":\"boolean\"},{\"name\":\"isNull\",\"type\":\"boolean\"},{\"name\":\"value\",\"type\":\"string\"},{\"name\":\"mysqlType\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence opTiem;
  @Deprecated public java.lang.CharSequence opType;
  @Deprecated public java.lang.CharSequence schemaName;
  @Deprecated public java.lang.CharSequence tableName;
  @Deprecated public java.lang.CharSequence primary;
  @Deprecated public java.lang.CharSequence primaryValue;
  @Deprecated public java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> changeColumnMap;
  @Deprecated public java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> postChangeContent;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BinlogTO() {}

  /**
   * All-args constructor.
   * @param opTiem The new value for opTiem
   * @param opType The new value for opType
   * @param schemaName The new value for schemaName
   * @param tableName The new value for tableName
   * @param primary The new value for primary
   * @param primaryValue The new value for primaryValue
   * @param changeColumnMap The new value for changeColumnMap
   * @param postChangeContent The new value for postChangeContent
   */
  public BinlogTO(java.lang.CharSequence opTiem, java.lang.CharSequence opType, java.lang.CharSequence schemaName, java.lang.CharSequence tableName, java.lang.CharSequence primary, java.lang.CharSequence primaryValue, java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> changeColumnMap, java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> postChangeContent) {
    this.opTiem = opTiem;
    this.opType = opType;
    this.schemaName = schemaName;
    this.tableName = tableName;
    this.primary = primary;
    this.primaryValue = primaryValue;
    this.changeColumnMap = changeColumnMap;
    this.postChangeContent = postChangeContent;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return opTiem;
    case 1: return opType;
    case 2: return schemaName;
    case 3: return tableName;
    case 4: return primary;
    case 5: return primaryValue;
    case 6: return changeColumnMap;
    case 7: return postChangeContent;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: opTiem = (java.lang.CharSequence)value$; break;
    case 1: opType = (java.lang.CharSequence)value$; break;
    case 2: schemaName = (java.lang.CharSequence)value$; break;
    case 3: tableName = (java.lang.CharSequence)value$; break;
    case 4: primary = (java.lang.CharSequence)value$; break;
    case 5: primaryValue = (java.lang.CharSequence)value$; break;
    case 6: changeColumnMap = (java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange>)value$; break;
    case 7: postChangeContent = (java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'opTiem' field.
   * @return The value of the 'opTiem' field.
   */
  public java.lang.CharSequence getOpTiem() {
    return opTiem;
  }

  /**
   * Sets the value of the 'opTiem' field.
   * @param value the value to set.
   */
  public void setOpTiem(java.lang.CharSequence value) {
    this.opTiem = value;
  }

  /**
   * Gets the value of the 'opType' field.
   * @return The value of the 'opType' field.
   */
  public java.lang.CharSequence getOpType() {
    return opType;
  }

  /**
   * Sets the value of the 'opType' field.
   * @param value the value to set.
   */
  public void setOpType(java.lang.CharSequence value) {
    this.opType = value;
  }

  /**
   * Gets the value of the 'schemaName' field.
   * @return The value of the 'schemaName' field.
   */
  public java.lang.CharSequence getSchemaName() {
    return schemaName;
  }

  /**
   * Sets the value of the 'schemaName' field.
   * @param value the value to set.
   */
  public void setSchemaName(java.lang.CharSequence value) {
    this.schemaName = value;
  }

  /**
   * Gets the value of the 'tableName' field.
   * @return The value of the 'tableName' field.
   */
  public java.lang.CharSequence getTableName() {
    return tableName;
  }

  /**
   * Sets the value of the 'tableName' field.
   * @param value the value to set.
   */
  public void setTableName(java.lang.CharSequence value) {
    this.tableName = value;
  }

  /**
   * Gets the value of the 'primary' field.
   * @return The value of the 'primary' field.
   */
  public java.lang.CharSequence getPrimary() {
    return primary;
  }

  /**
   * Sets the value of the 'primary' field.
   * @param value the value to set.
   */
  public void setPrimary(java.lang.CharSequence value) {
    this.primary = value;
  }

  /**
   * Gets the value of the 'primaryValue' field.
   * @return The value of the 'primaryValue' field.
   */
  public java.lang.CharSequence getPrimaryValue() {
    return primaryValue;
  }

  /**
   * Sets the value of the 'primaryValue' field.
   * @param value the value to set.
   */
  public void setPrimaryValue(java.lang.CharSequence value) {
    this.primaryValue = value;
  }

  /**
   * Gets the value of the 'changeColumnMap' field.
   * @return The value of the 'changeColumnMap' field.
   */
  public java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> getChangeColumnMap() {
    return changeColumnMap;
  }

  /**
   * Sets the value of the 'changeColumnMap' field.
   * @param value the value to set.
   */
  public void setChangeColumnMap(java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> value) {
    this.changeColumnMap = value;
  }

  /**
   * Gets the value of the 'postChangeContent' field.
   * @return The value of the 'postChangeContent' field.
   */
  public java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> getPostChangeContent() {
    return postChangeContent;
  }

  /**
   * Sets the value of the 'postChangeContent' field.
   * @param value the value to set.
   */
  public void setPostChangeContent(java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> value) {
    this.postChangeContent = value;
  }

  /**
   * Creates a new BinlogTO RecordBuilder.
   * @return A new BinlogTO RecordBuilder
   */
  public static com.yt.otter.canal.protocol.avro.BinlogTO.Builder newBuilder() {
    return new com.yt.otter.canal.protocol.avro.BinlogTO.Builder();
  }

  /**
   * Creates a new BinlogTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BinlogTO RecordBuilder
   */
  public static com.yt.otter.canal.protocol.avro.BinlogTO.Builder newBuilder(com.yt.otter.canal.protocol.avro.BinlogTO.Builder other) {
    return new com.yt.otter.canal.protocol.avro.BinlogTO.Builder(other);
  }

  /**
   * Creates a new BinlogTO RecordBuilder by copying an existing BinlogTO instance.
   * @param other The existing instance to copy.
   * @return A new BinlogTO RecordBuilder
   */
  public static com.yt.otter.canal.protocol.avro.BinlogTO.Builder newBuilder(com.yt.otter.canal.protocol.avro.BinlogTO other) {
    return new com.yt.otter.canal.protocol.avro.BinlogTO.Builder(other);
  }

  /**
   * RecordBuilder for BinlogTO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BinlogTO>
    implements org.apache.avro.data.RecordBuilder<BinlogTO> {

    private java.lang.CharSequence opTiem;
    private java.lang.CharSequence opType;
    private java.lang.CharSequence schemaName;
    private java.lang.CharSequence tableName;
    private java.lang.CharSequence primary;
    private java.lang.CharSequence primaryValue;
    private java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> changeColumnMap;
    private java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> postChangeContent;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yt.otter.canal.protocol.avro.BinlogTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.opTiem)) {
        this.opTiem = data().deepCopy(fields()[0].schema(), other.opTiem);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.opType)) {
        this.opType = data().deepCopy(fields()[1].schema(), other.opType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.schemaName)) {
        this.schemaName = data().deepCopy(fields()[2].schema(), other.schemaName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tableName)) {
        this.tableName = data().deepCopy(fields()[3].schema(), other.tableName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.primary)) {
        this.primary = data().deepCopy(fields()[4].schema(), other.primary);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.primaryValue)) {
        this.primaryValue = data().deepCopy(fields()[5].schema(), other.primaryValue);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.changeColumnMap)) {
        this.changeColumnMap = data().deepCopy(fields()[6].schema(), other.changeColumnMap);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.postChangeContent)) {
        this.postChangeContent = data().deepCopy(fields()[7].schema(), other.postChangeContent);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BinlogTO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yt.otter.canal.protocol.avro.BinlogTO other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.opTiem)) {
        this.opTiem = data().deepCopy(fields()[0].schema(), other.opTiem);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.opType)) {
        this.opType = data().deepCopy(fields()[1].schema(), other.opType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.schemaName)) {
        this.schemaName = data().deepCopy(fields()[2].schema(), other.schemaName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tableName)) {
        this.tableName = data().deepCopy(fields()[3].schema(), other.tableName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.primary)) {
        this.primary = data().deepCopy(fields()[4].schema(), other.primary);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.primaryValue)) {
        this.primaryValue = data().deepCopy(fields()[5].schema(), other.primaryValue);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.changeColumnMap)) {
        this.changeColumnMap = data().deepCopy(fields()[6].schema(), other.changeColumnMap);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.postChangeContent)) {
        this.postChangeContent = data().deepCopy(fields()[7].schema(), other.postChangeContent);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'opTiem' field.
      * @return The value.
      */
    public java.lang.CharSequence getOpTiem() {
      return opTiem;
    }

    /**
      * Sets the value of the 'opTiem' field.
      * @param value The value of 'opTiem'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setOpTiem(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.opTiem = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'opTiem' field has been set.
      * @return True if the 'opTiem' field has been set, false otherwise.
      */
    public boolean hasOpTiem() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'opTiem' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearOpTiem() {
      opTiem = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'opType' field.
      * @return The value.
      */
    public java.lang.CharSequence getOpType() {
      return opType;
    }

    /**
      * Sets the value of the 'opType' field.
      * @param value The value of 'opType'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setOpType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.opType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'opType' field has been set.
      * @return True if the 'opType' field has been set, false otherwise.
      */
    public boolean hasOpType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'opType' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearOpType() {
      opType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'schemaName' field.
      * @return The value.
      */
    public java.lang.CharSequence getSchemaName() {
      return schemaName;
    }

    /**
      * Sets the value of the 'schemaName' field.
      * @param value The value of 'schemaName'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setSchemaName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.schemaName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'schemaName' field has been set.
      * @return True if the 'schemaName' field has been set, false otherwise.
      */
    public boolean hasSchemaName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'schemaName' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearSchemaName() {
      schemaName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'tableName' field.
      * @return The value.
      */
    public java.lang.CharSequence getTableName() {
      return tableName;
    }

    /**
      * Sets the value of the 'tableName' field.
      * @param value The value of 'tableName'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setTableName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.tableName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'tableName' field has been set.
      * @return True if the 'tableName' field has been set, false otherwise.
      */
    public boolean hasTableName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'tableName' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearTableName() {
      tableName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'primary' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrimary() {
      return primary;
    }

    /**
      * Sets the value of the 'primary' field.
      * @param value The value of 'primary'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setPrimary(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.primary = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'primary' field has been set.
      * @return True if the 'primary' field has been set, false otherwise.
      */
    public boolean hasPrimary() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'primary' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearPrimary() {
      primary = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'primaryValue' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrimaryValue() {
      return primaryValue;
    }

    /**
      * Sets the value of the 'primaryValue' field.
      * @param value The value of 'primaryValue'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setPrimaryValue(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.primaryValue = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'primaryValue' field has been set.
      * @return True if the 'primaryValue' field has been set, false otherwise.
      */
    public boolean hasPrimaryValue() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'primaryValue' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearPrimaryValue() {
      primaryValue = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'changeColumnMap' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> getChangeColumnMap() {
      return changeColumnMap;
    }

    /**
      * Sets the value of the 'changeColumnMap' field.
      * @param value The value of 'changeColumnMap'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setChangeColumnMap(java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange> value) {
      validate(fields()[6], value);
      this.changeColumnMap = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'changeColumnMap' field has been set.
      * @return True if the 'changeColumnMap' field has been set, false otherwise.
      */
    public boolean hasChangeColumnMap() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'changeColumnMap' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearChangeColumnMap() {
      changeColumnMap = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'postChangeContent' field.
      * @return The value.
      */
    public java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> getPostChangeContent() {
      return postChangeContent;
    }

    /**
      * Sets the value of the 'postChangeContent' field.
      * @param value The value of 'postChangeContent'.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder setPostChangeContent(java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent> value) {
      validate(fields()[7], value);
      this.postChangeContent = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'postChangeContent' field has been set.
      * @return True if the 'postChangeContent' field has been set, false otherwise.
      */
    public boolean hasPostChangeContent() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'postChangeContent' field.
      * @return This builder.
      */
    public com.yt.otter.canal.protocol.avro.BinlogTO.Builder clearPostChangeContent() {
      postChangeContent = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public BinlogTO build() {
      try {
        BinlogTO record = new BinlogTO();
        record.opTiem = fieldSetFlags()[0] ? this.opTiem : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.opType = fieldSetFlags()[1] ? this.opType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.schemaName = fieldSetFlags()[2] ? this.schemaName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.tableName = fieldSetFlags()[3] ? this.tableName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.primary = fieldSetFlags()[4] ? this.primary : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.primaryValue = fieldSetFlags()[5] ? this.primaryValue : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.changeColumnMap = fieldSetFlags()[6] ? this.changeColumnMap : (java.util.Map<java.lang.CharSequence,com.yt.otter.canal.protocol.avro.ColumnChange>) defaultValue(fields()[6]);
        record.postChangeContent = fieldSetFlags()[7] ? this.postChangeContent : (java.util.List<com.yt.otter.canal.protocol.avro.ColumnContent>) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
