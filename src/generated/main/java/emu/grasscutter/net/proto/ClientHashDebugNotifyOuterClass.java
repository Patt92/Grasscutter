// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientHashDebugNotify.proto

package emu.grasscutter.net.proto;

public final class ClientHashDebugNotifyOuterClass {
  private ClientHashDebugNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientHashDebugNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientHashDebugNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 job_id = 9;</code>
     * @return The jobId.
     */
    int getJobId();
  }
  /**
   * <pre>
   * CmdId: 3061
   * Obf: NPBHGFHPGBP
   * </pre>
   *
   * Protobuf type {@code ClientHashDebugNotify}
   */
  public static final class ClientHashDebugNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientHashDebugNotify)
      ClientHashDebugNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientHashDebugNotify.newBuilder() to construct.
    private ClientHashDebugNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientHashDebugNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientHashDebugNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientHashDebugNotify(
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
            case 72: {

              jobId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.internal_static_ClientHashDebugNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.internal_static_ClientHashDebugNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.class, emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.Builder.class);
    }

    public static final int JOB_ID_FIELD_NUMBER = 9;
    private int jobId_;
    /**
     * <code>uint32 job_id = 9;</code>
     * @return The jobId.
     */
    @java.lang.Override
    public int getJobId() {
      return jobId_;
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
      if (jobId_ != 0) {
        output.writeUInt32(9, jobId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jobId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, jobId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify other = (emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify) obj;

      if (getJobId()
          != other.getJobId()) return false;
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
      hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
      hash = (53 * hash) + getJobId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify prototype) {
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
     * CmdId: 3061
     * Obf: NPBHGFHPGBP
     * </pre>
     *
     * Protobuf type {@code ClientHashDebugNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientHashDebugNotify)
        emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.internal_static_ClientHashDebugNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.internal_static_ClientHashDebugNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.class, emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.newBuilder()
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
        jobId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.internal_static_ClientHashDebugNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify build() {
        emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify buildPartial() {
        emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify result = new emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify(this);
        result.jobId_ = jobId_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify other) {
        if (other == emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify.getDefaultInstance()) return this;
        if (other.getJobId() != 0) {
          setJobId(other.getJobId());
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
        emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int jobId_ ;
      /**
       * <code>uint32 job_id = 9;</code>
       * @return The jobId.
       */
      @java.lang.Override
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>uint32 job_id = 9;</code>
       * @param value The jobId to set.
       * @return This builder for chaining.
       */
      public Builder setJobId(int value) {
        
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 job_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearJobId() {
        
        jobId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientHashDebugNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientHashDebugNotify)
    private static final emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify();
    }

    public static emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientHashDebugNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientHashDebugNotify>() {
      @java.lang.Override
      public ClientHashDebugNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientHashDebugNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientHashDebugNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientHashDebugNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientHashDebugNotifyOuterClass.ClientHashDebugNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientHashDebugNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientHashDebugNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ClientHashDebugNotify.proto\"\'\n\025ClientH" +
      "ashDebugNotify\022\016\n\006job_id\030\t \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientHashDebugNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientHashDebugNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientHashDebugNotify_descriptor,
        new java.lang.String[] { "JobId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
