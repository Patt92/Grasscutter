// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetWorldMpInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetWorldMpInfoRspOuterClass {
  private GetWorldMpInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetWorldMpInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetWorldMpInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_in_mp_mode = 2;</code>
     * @return The isInMpMode.
     */
    boolean getIsInMpMode();

    /**
     * <code>uint32 quit_mp_valid_time = 4;</code>
     * @return The quitMpValidTime.
     */
    int getQuitMpValidTime();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3316
   * Obf: ODKECHBHNEL
   * </pre>
   *
   * Protobuf type {@code GetWorldMpInfoRsp}
   */
  public static final class GetWorldMpInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetWorldMpInfoRsp)
      GetWorldMpInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetWorldMpInfoRsp.newBuilder() to construct.
    private GetWorldMpInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetWorldMpInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetWorldMpInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetWorldMpInfoRsp(
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
            case 16: {

              isInMpMode_ = input.readBool();
              break;
            }
            case 32: {

              quitMpValidTime_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.class, emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.Builder.class);
    }

    public static final int IS_IN_MP_MODE_FIELD_NUMBER = 2;
    private boolean isInMpMode_;
    /**
     * <code>bool is_in_mp_mode = 2;</code>
     * @return The isInMpMode.
     */
    @java.lang.Override
    public boolean getIsInMpMode() {
      return isInMpMode_;
    }

    public static final int QUIT_MP_VALID_TIME_FIELD_NUMBER = 4;
    private int quitMpValidTime_;
    /**
     * <code>uint32 quit_mp_valid_time = 4;</code>
     * @return The quitMpValidTime.
     */
    @java.lang.Override
    public int getQuitMpValidTime() {
      return quitMpValidTime_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (isInMpMode_ != false) {
        output.writeBool(2, isInMpMode_);
      }
      if (quitMpValidTime_ != 0) {
        output.writeUInt32(4, quitMpValidTime_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isInMpMode_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isInMpMode_);
      }
      if (quitMpValidTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, quitMpValidTime_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp other = (emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp) obj;

      if (getIsInMpMode()
          != other.getIsInMpMode()) return false;
      if (getQuitMpValidTime()
          != other.getQuitMpValidTime()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_IN_MP_MODE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInMpMode());
      hash = (37 * hash) + QUIT_MP_VALID_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getQuitMpValidTime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp prototype) {
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
     * CmdId: 3316
     * Obf: ODKECHBHNEL
     * </pre>
     *
     * Protobuf type {@code GetWorldMpInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetWorldMpInfoRsp)
        emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.class, emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.newBuilder()
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
        isInMpMode_ = false;

        quitMpValidTime_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp build() {
        emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp result = new emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp(this);
        result.isInMpMode_ = isInMpMode_;
        result.quitMpValidTime_ = quitMpValidTime_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp.getDefaultInstance()) return this;
        if (other.getIsInMpMode() != false) {
          setIsInMpMode(other.getIsInMpMode());
        }
        if (other.getQuitMpValidTime() != 0) {
          setQuitMpValidTime(other.getQuitMpValidTime());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isInMpMode_ ;
      /**
       * <code>bool is_in_mp_mode = 2;</code>
       * @return The isInMpMode.
       */
      @java.lang.Override
      public boolean getIsInMpMode() {
        return isInMpMode_;
      }
      /**
       * <code>bool is_in_mp_mode = 2;</code>
       * @param value The isInMpMode to set.
       * @return This builder for chaining.
       */
      public Builder setIsInMpMode(boolean value) {
        
        isInMpMode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_mp_mode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInMpMode() {
        
        isInMpMode_ = false;
        onChanged();
        return this;
      }

      private int quitMpValidTime_ ;
      /**
       * <code>uint32 quit_mp_valid_time = 4;</code>
       * @return The quitMpValidTime.
       */
      @java.lang.Override
      public int getQuitMpValidTime() {
        return quitMpValidTime_;
      }
      /**
       * <code>uint32 quit_mp_valid_time = 4;</code>
       * @param value The quitMpValidTime to set.
       * @return This builder for chaining.
       */
      public Builder setQuitMpValidTime(int value) {
        
        quitMpValidTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quit_mp_valid_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuitMpValidTime() {
        
        quitMpValidTime_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetWorldMpInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetWorldMpInfoRsp)
    private static final emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetWorldMpInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetWorldMpInfoRsp>() {
      @java.lang.Override
      public GetWorldMpInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetWorldMpInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetWorldMpInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetWorldMpInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWorldMpInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWorldMpInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetWorldMpInfoRsp.proto\"W\n\021GetWorldMpI" +
      "nfoRsp\022\025\n\ris_in_mp_mode\030\002 \001(\010\022\032\n\022quit_mp" +
      "_valid_time\030\004 \001(\r\022\017\n\007retcode\030\014 \001(\005B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetWorldMpInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetWorldMpInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWorldMpInfoRsp_descriptor,
        new java.lang.String[] { "IsInMpMode", "QuitMpValidTime", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
