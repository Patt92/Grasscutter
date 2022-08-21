// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireWorkReq.proto

package emu.grasscutter.net.proto;

public final class FireWorkReqOuterClass {
  private FireWorkReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireWorkReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireWorkReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FireWorkData fireWorkData = 7;</code>
     * @return Whether the fireWorkData field is set.
     */
    boolean hasFireWorkData();
    /**
     * <code>.FireWorkData fireWorkData = 7;</code>
     * @return The fireWorkData.
     */
    emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData getFireWorkData();
    /**
     * <code>.FireWorkData fireWorkData = 7;</code>
     */
    emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 6068
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code FireWorkReq}
   */
  public static final class FireWorkReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireWorkReq)
      FireWorkReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireWorkReq.newBuilder() to construct.
    private FireWorkReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireWorkReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireWorkReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FireWorkReq(
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
            case 58: {
              emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder subBuilder = null;
              if (fireWorkData_ != null) {
                subBuilder = fireWorkData_.toBuilder();
              }
              fireWorkData_ = input.readMessage(emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fireWorkData_);
                fireWorkData_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FireWorkReqOuterClass.internal_static_FireWorkReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.class, emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.Builder.class);
    }

    public static final int FIREWORKDATA_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData fireWorkData_;
    /**
     * <code>.FireWorkData fireWorkData = 7;</code>
     * @return Whether the fireWorkData field is set.
     */
    @java.lang.Override
    public boolean hasFireWorkData() {
      return fireWorkData_ != null;
    }
    /**
     * <code>.FireWorkData fireWorkData = 7;</code>
     * @return The fireWorkData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData getFireWorkData() {
      return fireWorkData_ == null ? emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.getDefaultInstance() : fireWorkData_;
    }
    /**
     * <code>.FireWorkData fireWorkData = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder() {
      return getFireWorkData();
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
      if (fireWorkData_ != null) {
        output.writeMessage(7, getFireWorkData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fireWorkData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getFireWorkData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq other = (emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq) obj;

      if (hasFireWorkData() != other.hasFireWorkData()) return false;
      if (hasFireWorkData()) {
        if (!getFireWorkData()
            .equals(other.getFireWorkData())) return false;
      }
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
      if (hasFireWorkData()) {
        hash = (37 * hash) + FIREWORKDATA_FIELD_NUMBER;
        hash = (53 * hash) + getFireWorkData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq prototype) {
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
     * CmdId: 6068
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code FireWorkReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireWorkReq)
        emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FireWorkReqOuterClass.internal_static_FireWorkReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.class, emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.newBuilder()
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
        if (fireWorkDataBuilder_ == null) {
          fireWorkData_ = null;
        } else {
          fireWorkData_ = null;
          fireWorkDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq build() {
        emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq buildPartial() {
        emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq result = new emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq(this);
        if (fireWorkDataBuilder_ == null) {
          result.fireWorkData_ = fireWorkData_;
        } else {
          result.fireWorkData_ = fireWorkDataBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq) {
          return mergeFrom((emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq other) {
        if (other == emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq.getDefaultInstance()) return this;
        if (other.hasFireWorkData()) {
          mergeFireWorkData(other.getFireWorkData());
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
        emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData fireWorkData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> fireWorkDataBuilder_;
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       * @return Whether the fireWorkData field is set.
       */
      public boolean hasFireWorkData() {
        return fireWorkDataBuilder_ != null || fireWorkData_ != null;
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       * @return The fireWorkData.
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData getFireWorkData() {
        if (fireWorkDataBuilder_ == null) {
          return fireWorkData_ == null ? emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.getDefaultInstance() : fireWorkData_;
        } else {
          return fireWorkDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      public Builder setFireWorkData(emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData value) {
        if (fireWorkDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fireWorkData_ = value;
          onChanged();
        } else {
          fireWorkDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      public Builder setFireWorkData(
          emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
        if (fireWorkDataBuilder_ == null) {
          fireWorkData_ = builderForValue.build();
          onChanged();
        } else {
          fireWorkDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      public Builder mergeFireWorkData(emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData value) {
        if (fireWorkDataBuilder_ == null) {
          if (fireWorkData_ != null) {
            fireWorkData_ =
              emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.newBuilder(fireWorkData_).mergeFrom(value).buildPartial();
          } else {
            fireWorkData_ = value;
          }
          onChanged();
        } else {
          fireWorkDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      public Builder clearFireWorkData() {
        if (fireWorkDataBuilder_ == null) {
          fireWorkData_ = null;
          onChanged();
        } else {
          fireWorkData_ = null;
          fireWorkDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder getFireWorkDataBuilder() {
        
        onChanged();
        return getFireWorkDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      public emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder() {
        if (fireWorkDataBuilder_ != null) {
          return fireWorkDataBuilder_.getMessageOrBuilder();
        } else {
          return fireWorkData_ == null ?
              emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.getDefaultInstance() : fireWorkData_;
        }
      }
      /**
       * <code>.FireWorkData fireWorkData = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder> 
          getFireWorkDataFieldBuilder() {
        if (fireWorkDataBuilder_ == null) {
          fireWorkDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkData.Builder, emu.grasscutter.net.proto.FireWorkDataOuterClass.FireWorkDataOrBuilder>(
                  getFireWorkData(),
                  getParentForChildren(),
                  isClean());
          fireWorkData_ = null;
        }
        return fireWorkDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FireWorkReq)
    }

    // @@protoc_insertion_point(class_scope:FireWorkReq)
    private static final emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq();
    }

    public static emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireWorkReq>
        PARSER = new com.google.protobuf.AbstractParser<FireWorkReq>() {
      @java.lang.Override
      public FireWorkReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FireWorkReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FireWorkReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireWorkReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FireWorkReqOuterClass.FireWorkReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireWorkReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireWorkReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FireWorkReq.proto\032\022FireWorkData.proto\"" +
      "2\n\013FireWorkReq\022#\n\014fireWorkData\030\007 \001(\0132\r.F" +
      "ireWorkDataB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FireWorkDataOuterClass.getDescriptor(),
        });
    internal_static_FireWorkReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireWorkReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireWorkReq_descriptor,
        new java.lang.String[] { "FireWorkData", });
    emu.grasscutter.net.proto.FireWorkDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
