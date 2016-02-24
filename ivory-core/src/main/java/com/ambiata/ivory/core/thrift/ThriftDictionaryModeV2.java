/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.core.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThriftDictionaryModeV2 extends org.apache.thrift.TUnion<ThriftDictionaryModeV2, ThriftDictionaryModeV2._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDictionaryModeV2");
  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField KEYED_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("keyedSet", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField KEYED_SET_MULTI_FIELD_DESC = new org.apache.thrift.protocol.TField("keyedSetMulti", org.apache.thrift.protocol.TType.LIST, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ThriftDictionaryMode
     */
    MODE((short)1, "mode"),
    KEYED_SET((short)2, "keyedSet"),
    KEYED_SET_MULTI((short)3, "keyedSetMulti");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MODE
          return MODE;
        case 2: // KEYED_SET
          return KEYED_SET;
        case 3: // KEYED_SET_MULTI
          return KEYED_SET_MULTI;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftDictionaryMode.class)));
    tmpMap.put(_Fields.KEYED_SET, new org.apache.thrift.meta_data.FieldMetaData("keyedSet", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEYED_SET_MULTI, new org.apache.thrift.meta_data.FieldMetaData("keyedSetMulti", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDictionaryModeV2.class, metaDataMap);
  }

  public ThriftDictionaryModeV2() {
    super();
  }

  public ThriftDictionaryModeV2(_Fields setField, Object value) {
    super(setField, value);
  }

  public ThriftDictionaryModeV2(ThriftDictionaryModeV2 other) {
    super(other);
  }
  public ThriftDictionaryModeV2 deepCopy() {
    return new ThriftDictionaryModeV2(this);
  }

  public static ThriftDictionaryModeV2 mode(ThriftDictionaryMode value) {
    ThriftDictionaryModeV2 x = new ThriftDictionaryModeV2();
    x.setMode(value);
    return x;
  }

  public static ThriftDictionaryModeV2 keyedSet(String value) {
    ThriftDictionaryModeV2 x = new ThriftDictionaryModeV2();
    x.setKeyedSet(value);
    return x;
  }

  public static ThriftDictionaryModeV2 keyedSetMulti(List<String> value) {
    ThriftDictionaryModeV2 x = new ThriftDictionaryModeV2();
    x.setKeyedSetMulti(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case MODE:
        if (value instanceof ThriftDictionaryMode) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ThriftDictionaryMode for field 'mode', but got " + value.getClass().getSimpleName());
      case KEYED_SET:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'keyedSet', but got " + value.getClass().getSimpleName());
      case KEYED_SET_MULTI:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<String> for field 'keyedSetMulti', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case MODE:
          if (field.type == MODE_FIELD_DESC.type) {
            ThriftDictionaryMode mode;
            mode = ThriftDictionaryMode.findByValue(iprot.readI32());
            return mode;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case KEYED_SET:
          if (field.type == KEYED_SET_FIELD_DESC.type) {
            String keyedSet;
            keyedSet = iprot.readString();
            return keyedSet;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case KEYED_SET_MULTI:
          if (field.type == KEYED_SET_MULTI_FIELD_DESC.type) {
            List<String> keyedSetMulti;
            {
              org.apache.thrift.protocol.TList _list26 = iprot.readListBegin();
              keyedSetMulti = new ArrayList<String>(_list26.size);
              for (int _i27 = 0; _i27 < _list26.size; ++_i27)
              {
                String _elem28;
                _elem28 = iprot.readString();
                keyedSetMulti.add(_elem28);
              }
              iprot.readListEnd();
            }
            return keyedSetMulti;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case MODE:
        ThriftDictionaryMode mode = (ThriftDictionaryMode)value_;
        oprot.writeI32(mode.getValue());
        return;
      case KEYED_SET:
        String keyedSet = (String)value_;
        oprot.writeString(keyedSet);
        return;
      case KEYED_SET_MULTI:
        List<String> keyedSetMulti = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, keyedSetMulti.size()));
          for (String _iter29 : keyedSetMulti)
          {
            oprot.writeString(_iter29);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case MODE:
          ThriftDictionaryMode mode;
          mode = ThriftDictionaryMode.findByValue(iprot.readI32());
          return mode;
        case KEYED_SET:
          String keyedSet;
          keyedSet = iprot.readString();
          return keyedSet;
        case KEYED_SET_MULTI:
          List<String> keyedSetMulti;
          {
            org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
            keyedSetMulti = new ArrayList<String>(_list30.size);
            for (int _i31 = 0; _i31 < _list30.size; ++_i31)
            {
              String _elem32;
              _elem32 = iprot.readString();
              keyedSetMulti.add(_elem32);
            }
            iprot.readListEnd();
          }
          return keyedSetMulti;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case MODE:
        ThriftDictionaryMode mode = (ThriftDictionaryMode)value_;
        oprot.writeI32(mode.getValue());
        return;
      case KEYED_SET:
        String keyedSet = (String)value_;
        oprot.writeString(keyedSet);
        return;
      case KEYED_SET_MULTI:
        List<String> keyedSetMulti = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, keyedSetMulti.size()));
          for (String _iter33 : keyedSetMulti)
          {
            oprot.writeString(_iter33);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case MODE:
        return MODE_FIELD_DESC;
      case KEYED_SET:
        return KEYED_SET_FIELD_DESC;
      case KEYED_SET_MULTI:
        return KEYED_SET_MULTI_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  /**
   * 
   * @see ThriftDictionaryMode
   */
  public ThriftDictionaryMode getMode() {
    if (getSetField() == _Fields.MODE) {
      return (ThriftDictionaryMode)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'mode' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * 
   * @see ThriftDictionaryMode
   */
  public void setMode(ThriftDictionaryMode value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.MODE;
    value_ = value;
  }

  public String getKeyedSet() {
    if (getSetField() == _Fields.KEYED_SET) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'keyedSet' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setKeyedSet(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.KEYED_SET;
    value_ = value;
  }

  public List<String> getKeyedSetMulti() {
    if (getSetField() == _Fields.KEYED_SET_MULTI) {
      return (List<String>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'keyedSetMulti' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setKeyedSetMulti(List<String> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.KEYED_SET_MULTI;
    value_ = value;
  }

  public boolean isSetMode() {
    return setField_ == _Fields.MODE;
  }


  public boolean isSetKeyedSet() {
    return setField_ == _Fields.KEYED_SET;
  }


  public boolean isSetKeyedSetMulti() {
    return setField_ == _Fields.KEYED_SET_MULTI;
  }


  public boolean equals(Object other) {
    if (other instanceof ThriftDictionaryModeV2) {
      return equals((ThriftDictionaryModeV2)other);
    } else {
      return false;
    }
  }

  public boolean equals(ThriftDictionaryModeV2 other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ThriftDictionaryModeV2 other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  /**
   * If you'd like this to perform more respectably, use the hashcode generator option.
   */
  @Override
  public int hashCode() {
    return 0;
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}