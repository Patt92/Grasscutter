// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpiceStageData.proto

package emu.grasscutter.net.proto;

public final class SpiceStageDataOuterClass {
  private SpiceStageDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SpiceStageDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SpiceStageData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isOpen = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 successTimes = 3;</code>
     * @return The successTimes.
     */
    int getSuccessTimes();

    /**
     * <code>uint32 stageId = 9;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code SpiceStageData}
   */
  public static final class SpiceStageData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SpiceStageData)
      SpiceStageDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SpiceStageData.newBuilder() to construct.
    private SpiceStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SpiceStageData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SpiceStageData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SpiceStageData(
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
            case 24: {

              successTimes_ = input.readUInt32();
              break;
            }
            case 72: {

              stageId_ = input.readUInt32();
              break;
            }
            case 80: {

              isOpen_ = input.readBool();
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
      return emu.grasscutter.net.proto.SpiceStageDataOuterClass.internal_static_SpiceStageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SpiceStageDataOuterClass.internal_static_SpiceStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.class, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder.class);
    }

    public static final int ISOPEN_FIELD_NUMBER = 10;
    private boolean isOpen_;
    /**
     * <code>bool isOpen = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int SUCCESSTIMES_FIELD_NUMBER = 3;
    private int successTimes_;
    /**
     * <code>uint32 successTimes = 3;</code>
     * @return The successTimes.
     */
    @java.lang.Override
    public int getSuccessTimes() {
      return successTimes_;
    }

    public static final int STAGEID_FIELD_NUMBER = 9;
    private int stageId_;
    /**
     * <code>uint32 stageId = 9;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (successTimes_ != 0) {
        output.writeUInt32(3, successTimes_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(9, stageId_);
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (successTimes_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, successTimes_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, stageId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData other = (emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getSuccessTimes()
          != other.getSuccessTimes()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + SUCCESSTIMES_FIELD_NUMBER;
      hash = (53 * hash) + getSuccessTimes();
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData prototype) {
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
     * Protobuf type {@code SpiceStageData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SpiceStageData)
        emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SpiceStageDataOuterClass.internal_static_SpiceStageData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SpiceStageDataOuterClass.internal_static_SpiceStageData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.class, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.newBuilder()
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
        isOpen_ = false;

        successTimes_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SpiceStageDataOuterClass.internal_static_SpiceStageData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData build() {
        emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData buildPartial() {
        emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData result = new emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData(this);
        result.isOpen_ = isOpen_;
        result.successTimes_ = successTimes_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData) {
          return mergeFrom((emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData other) {
        if (other == emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getSuccessTimes() != 0) {
          setSuccessTimes(other.getSuccessTimes());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int successTimes_ ;
      /**
       * <code>uint32 successTimes = 3;</code>
       * @return The successTimes.
       */
      @java.lang.Override
      public int getSuccessTimes() {
        return successTimes_;
      }
      /**
       * <code>uint32 successTimes = 3;</code>
       * @param value The successTimes to set.
       * @return This builder for chaining.
       */
      public Builder setSuccessTimes(int value) {
        
        successTimes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 successTimes = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuccessTimes() {
        
        successTimes_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 9;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 9;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SpiceStageData)
    }

    // @@protoc_insertion_point(class_scope:SpiceStageData)
    private static final emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData();
    }

    public static emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SpiceStageData>
        PARSER = new com.google.protobuf.AbstractParser<SpiceStageData>() {
      @java.lang.Override
      public SpiceStageData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpiceStageData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SpiceStageData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SpiceStageData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SpiceStageData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SpiceStageData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SpiceStageData.proto\"G\n\016SpiceStageData" +
      "\022\016\n\006isOpen\030\n \001(\010\022\024\n\014successTimes\030\003 \001(\r\022\017" +
      "\n\007stageId\030\t \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SpiceStageData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SpiceStageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SpiceStageData_descriptor,
        new java.lang.String[] { "IsOpen", "SuccessTimes", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
