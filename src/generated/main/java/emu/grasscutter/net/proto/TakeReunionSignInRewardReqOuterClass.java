// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeReunionSignInRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeReunionSignInRewardReqOuterClass {
  private TakeReunionSignInRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeReunionSignInRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeReunionSignInRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 1;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 reward_day = 12;</code>
     * @return The rewardDay.
     */
    int getRewardDay();
  }
  /**
   * <pre>
   * CmdId: 5075
   * Obf: CDPLNEJLJHH
   * </pre>
   *
   * Protobuf type {@code TakeReunionSignInRewardReq}
   */
  public static final class TakeReunionSignInRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeReunionSignInRewardReq)
      TakeReunionSignInRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeReunionSignInRewardReq.newBuilder() to construct.
    private TakeReunionSignInRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeReunionSignInRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeReunionSignInRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeReunionSignInRewardReq(
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

              configId_ = input.readUInt32();
              break;
            }
            case 96: {

              rewardDay_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.class, emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 1;
    private int configId_;
    /**
     * <code>uint32 config_id = 1;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int REWARD_DAY_FIELD_NUMBER = 12;
    private int rewardDay_;
    /**
     * <code>uint32 reward_day = 12;</code>
     * @return The rewardDay.
     */
    @java.lang.Override
    public int getRewardDay() {
      return rewardDay_;
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
      if (configId_ != 0) {
        output.writeUInt32(1, configId_);
      }
      if (rewardDay_ != 0) {
        output.writeUInt32(12, rewardDay_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, configId_);
      }
      if (rewardDay_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, rewardDay_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq other = (emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
      if (getRewardDay()
          != other.getRewardDay()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + REWARD_DAY_FIELD_NUMBER;
      hash = (53 * hash) + getRewardDay();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq prototype) {
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
     * CmdId: 5075
     * Obf: CDPLNEJLJHH
     * </pre>
     *
     * Protobuf type {@code TakeReunionSignInRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeReunionSignInRewardReq)
        emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.class, emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.newBuilder()
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
        configId_ = 0;

        rewardDay_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq build() {
        emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq buildPartial() {
        emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq result = new emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq(this);
        result.configId_ = configId_;
        result.rewardDay_ = rewardDay_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq other) {
        if (other == emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getRewardDay() != 0) {
          setRewardDay(other.getRewardDay());
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
        emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 1;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 1;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int rewardDay_ ;
      /**
       * <code>uint32 reward_day = 12;</code>
       * @return The rewardDay.
       */
      @java.lang.Override
      public int getRewardDay() {
        return rewardDay_;
      }
      /**
       * <code>uint32 reward_day = 12;</code>
       * @param value The rewardDay to set.
       * @return This builder for chaining.
       */
      public Builder setRewardDay(int value) {
        
        rewardDay_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_day = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardDay() {
        
        rewardDay_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeReunionSignInRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeReunionSignInRewardReq)
    private static final emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq();
    }

    public static emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeReunionSignInRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeReunionSignInRewardReq>() {
      @java.lang.Override
      public TakeReunionSignInRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeReunionSignInRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeReunionSignInRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeReunionSignInRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeReunionSignInRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeReunionSignInRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TakeReunionSignInRewardReq.proto\"C\n\032Ta" +
      "keReunionSignInRewardReq\022\021\n\tconfig_id\030\001 " +
      "\001(\r\022\022\n\nreward_day\030\014 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeReunionSignInRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeReunionSignInRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeReunionSignInRewardReq_descriptor,
        new java.lang.String[] { "ConfigId", "RewardDay", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
