// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetReportReq.proto

package emu.grasscutter.net.proto;

public final class WidgetReportReqOuterClass {
  private WidgetReportReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetReportReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetReportReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool OLMDMFHODCH = 9;</code>
     * @return The oLMDMFHODCH.
     */
    boolean getOLMDMFHODCH();

    /**
     * <code>bool NJIKGBHPOEC = 15;</code>
     * @return The nJIKGBHPOEC.
     */
    boolean getNJIKGBHPOEC();

    /**
     * <code>uint32 weather_wizard_shield_value = 1;</code>
     * @return The weatherWizardShieldValue.
     */
    int getWeatherWizardShieldValue();

    /**
     * <code>uint32 material_id = 13;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool KMHNHCHDJOB = 14;</code>
     * @return The kMHNHCHDJOB.
     */
    boolean getKMHNHCHDJOB();
  }
  /**
   * <pre>
   * CmdId: 4251
   * Obf: BKKIKGIALNK
   * </pre>
   *
   * Protobuf type {@code WidgetReportReq}
   */
  public static final class WidgetReportReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetReportReq)
      WidgetReportReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetReportReq.newBuilder() to construct.
    private WidgetReportReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetReportReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetReportReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetReportReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              weatherWizardShieldValue_ = input.readUInt32();
              break;
            }
            case 72: {

              oLMDMFHODCH_ = input.readBool();
              break;
            }
            case 104: {

              materialId_ = input.readUInt32();
              break;
            }
            case 112: {

              kMHNHCHDJOB_ = input.readBool();
              break;
            }
            case 120: {

              nJIKGBHPOEC_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.class, emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.Builder.class);
    }

    public static final int OLMDMFHODCH_FIELD_NUMBER = 9;
    private boolean oLMDMFHODCH_;
    /**
     * <code>bool OLMDMFHODCH = 9;</code>
     * @return The oLMDMFHODCH.
     */
    @java.lang.Override
    public boolean getOLMDMFHODCH() {
      return oLMDMFHODCH_;
    }

    public static final int NJIKGBHPOEC_FIELD_NUMBER = 15;
    private boolean nJIKGBHPOEC_;
    /**
     * <code>bool NJIKGBHPOEC = 15;</code>
     * @return The nJIKGBHPOEC.
     */
    @java.lang.Override
    public boolean getNJIKGBHPOEC() {
      return nJIKGBHPOEC_;
    }

    public static final int WEATHER_WIZARD_SHIELD_VALUE_FIELD_NUMBER = 1;
    private int weatherWizardShieldValue_;
    /**
     * <code>uint32 weather_wizard_shield_value = 1;</code>
     * @return The weatherWizardShieldValue.
     */
    @java.lang.Override
    public int getWeatherWizardShieldValue() {
      return weatherWizardShieldValue_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 13;
    private int materialId_;
    /**
     * <code>uint32 material_id = 13;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int KMHNHCHDJOB_FIELD_NUMBER = 14;
    private boolean kMHNHCHDJOB_;
    /**
     * <code>bool KMHNHCHDJOB = 14;</code>
     * @return The kMHNHCHDJOB.
     */
    @java.lang.Override
    public boolean getKMHNHCHDJOB() {
      return kMHNHCHDJOB_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (weatherWizardShieldValue_ != 0) {
        output.writeUInt32(1, weatherWizardShieldValue_);
      }
      if (oLMDMFHODCH_ != false) {
        output.writeBool(9, oLMDMFHODCH_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(13, materialId_);
      }
      if (kMHNHCHDJOB_ != false) {
        output.writeBool(14, kMHNHCHDJOB_);
      }
      if (nJIKGBHPOEC_ != false) {
        output.writeBool(15, nJIKGBHPOEC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (weatherWizardShieldValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, weatherWizardShieldValue_);
      }
      if (oLMDMFHODCH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, oLMDMFHODCH_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, materialId_);
      }
      if (kMHNHCHDJOB_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, kMHNHCHDJOB_);
      }
      if (nJIKGBHPOEC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, nJIKGBHPOEC_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq other = (emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq) obj;

      if (getOLMDMFHODCH()
          != other.getOLMDMFHODCH()) return false;
      if (getNJIKGBHPOEC()
          != other.getNJIKGBHPOEC()) return false;
      if (getWeatherWizardShieldValue()
          != other.getWeatherWizardShieldValue()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getKMHNHCHDJOB()
          != other.getKMHNHCHDJOB()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OLMDMFHODCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOLMDMFHODCH());
      hash = (37 * hash) + NJIKGBHPOEC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNJIKGBHPOEC());
      hash = (37 * hash) + WEATHER_WIZARD_SHIELD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherWizardShieldValue();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + KMHNHCHDJOB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKMHNHCHDJOB());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 4251
     * Obf: BKKIKGIALNK
     * </pre>
     *
     * Protobuf type {@code WidgetReportReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetReportReq)
        emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.class, emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        oLMDMFHODCH_ = false;

        nJIKGBHPOEC_ = false;

        weatherWizardShieldValue_ = 0;

        materialId_ = 0;

        kMHNHCHDJOB_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq build() {
        emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq buildPartial() {
        emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq result = new emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq(this);
        result.oLMDMFHODCH_ = oLMDMFHODCH_;
        result.nJIKGBHPOEC_ = nJIKGBHPOEC_;
        result.weatherWizardShieldValue_ = weatherWizardShieldValue_;
        result.materialId_ = materialId_;
        result.kMHNHCHDJOB_ = kMHNHCHDJOB_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq other) {
        if (other == emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq.getDefaultInstance()) return this;
        if (other.getOLMDMFHODCH() != false) {
          setOLMDMFHODCH(other.getOLMDMFHODCH());
        }
        if (other.getNJIKGBHPOEC() != false) {
          setNJIKGBHPOEC(other.getNJIKGBHPOEC());
        }
        if (other.getWeatherWizardShieldValue() != 0) {
          setWeatherWizardShieldValue(other.getWeatherWizardShieldValue());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getKMHNHCHDJOB() != false) {
          setKMHNHCHDJOB(other.getKMHNHCHDJOB());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean oLMDMFHODCH_ ;
      /**
       * <code>bool OLMDMFHODCH = 9;</code>
       * @return The oLMDMFHODCH.
       */
      @java.lang.Override
      public boolean getOLMDMFHODCH() {
        return oLMDMFHODCH_;
      }
      /**
       * <code>bool OLMDMFHODCH = 9;</code>
       * @param value The oLMDMFHODCH to set.
       * @return This builder for chaining.
       */
      public Builder setOLMDMFHODCH(boolean value) {
        
        oLMDMFHODCH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool OLMDMFHODCH = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOLMDMFHODCH() {
        
        oLMDMFHODCH_ = false;
        onChanged();
        return this;
      }

      private boolean nJIKGBHPOEC_ ;
      /**
       * <code>bool NJIKGBHPOEC = 15;</code>
       * @return The nJIKGBHPOEC.
       */
      @java.lang.Override
      public boolean getNJIKGBHPOEC() {
        return nJIKGBHPOEC_;
      }
      /**
       * <code>bool NJIKGBHPOEC = 15;</code>
       * @param value The nJIKGBHPOEC to set.
       * @return This builder for chaining.
       */
      public Builder setNJIKGBHPOEC(boolean value) {
        
        nJIKGBHPOEC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool NJIKGBHPOEC = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearNJIKGBHPOEC() {
        
        nJIKGBHPOEC_ = false;
        onChanged();
        return this;
      }

      private int weatherWizardShieldValue_ ;
      /**
       * <code>uint32 weather_wizard_shield_value = 1;</code>
       * @return The weatherWizardShieldValue.
       */
      @java.lang.Override
      public int getWeatherWizardShieldValue() {
        return weatherWizardShieldValue_;
      }
      /**
       * <code>uint32 weather_wizard_shield_value = 1;</code>
       * @param value The weatherWizardShieldValue to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherWizardShieldValue(int value) {
        
        weatherWizardShieldValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_wizard_shield_value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherWizardShieldValue() {
        
        weatherWizardShieldValue_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 13;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 13;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean kMHNHCHDJOB_ ;
      /**
       * <code>bool KMHNHCHDJOB = 14;</code>
       * @return The kMHNHCHDJOB.
       */
      @java.lang.Override
      public boolean getKMHNHCHDJOB() {
        return kMHNHCHDJOB_;
      }
      /**
       * <code>bool KMHNHCHDJOB = 14;</code>
       * @param value The kMHNHCHDJOB to set.
       * @return This builder for chaining.
       */
      public Builder setKMHNHCHDJOB(boolean value) {
        
        kMHNHCHDJOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool KMHNHCHDJOB = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKMHNHCHDJOB() {
        
        kMHNHCHDJOB_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:WidgetReportReq)
    }

    // @@protoc_insertion_point(class_scope:WidgetReportReq)
    private static final emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq();
    }

    public static emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetReportReq>
        PARSER = new com.google.protobuf.AbstractParser<WidgetReportReq>() {
      @java.lang.Override
      public WidgetReportReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetReportReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetReportReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetReportReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetReportReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetReportReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WidgetReportReq.proto\"\212\001\n\017WidgetReport" +
      "Req\022\023\n\013OLMDMFHODCH\030\t \001(\010\022\023\n\013NJIKGBHPOEC\030" +
      "\017 \001(\010\022#\n\033weather_wizard_shield_value\030\001 \001" +
      "(\r\022\023\n\013material_id\030\r \001(\r\022\023\n\013KMHNHCHDJOB\030\016" +
      " \001(\010B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetReportReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetReportReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetReportReq_descriptor,
        new java.lang.String[] { "OLMDMFHODCH", "NJIKGBHPOEC", "WeatherWizardShieldValue", "MaterialId", "KMHNHCHDJOB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
