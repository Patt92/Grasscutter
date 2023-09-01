// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarUpgradeReq.proto

package emu.grasscutter.net.proto;

public final class AvatarUpgradeReqOuterClass {
  private AvatarUpgradeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarUpgradeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarUpgradeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 5;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 avatar_guid = 10;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 count = 1;</code>
     * @return The count.
     */
    int getCount();
  }
  /**
   * <pre>
   * CmdId: 28204
   * Obf: CFIFEHLBHPM
   * </pre>
   *
   * Protobuf type {@code AvatarUpgradeReq}
   */
  public static final class AvatarUpgradeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarUpgradeReq)
      AvatarUpgradeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarUpgradeReq.newBuilder() to construct.
    private AvatarUpgradeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarUpgradeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarUpgradeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarUpgradeReq(
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

              count_ = input.readUInt32();
              break;
            }
            case 40: {

              itemId_ = input.readUInt32();
              break;
            }
            case 80: {

              avatarGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.internal_static_AvatarUpgradeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.internal_static_AvatarUpgradeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.class, emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 5;
    private int itemId_;
    /**
     * <code>uint32 item_id = 5;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 10;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 10;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int COUNT_FIELD_NUMBER = 1;
    private int count_;
    /**
     * <code>uint32 count = 1;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
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
      if (count_ != 0) {
        output.writeUInt32(1, count_);
      }
      if (itemId_ != 0) {
        output.writeUInt32(5, itemId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(10, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, count_);
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, itemId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq other = (emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getCount()
          != other.getCount()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq prototype) {
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
     * CmdId: 28204
     * Obf: CFIFEHLBHPM
     * </pre>
     *
     * Protobuf type {@code AvatarUpgradeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarUpgradeReq)
        emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.internal_static_AvatarUpgradeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.internal_static_AvatarUpgradeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.class, emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.newBuilder()
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
        itemId_ = 0;

        avatarGuid_ = 0L;

        count_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.internal_static_AvatarUpgradeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq build() {
        emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq buildPartial() {
        emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq result = new emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq(this);
        result.itemId_ = itemId_;
        result.avatarGuid_ = avatarGuid_;
        result.count_ = count_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq other) {
        if (other == emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
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
        emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 5;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 5;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 10;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 10;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 1;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 1;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarUpgradeReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarUpgradeReq)
    private static final emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq();
    }

    public static emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarUpgradeReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarUpgradeReq>() {
      @java.lang.Override
      public AvatarUpgradeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarUpgradeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarUpgradeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarUpgradeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarUpgradeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarUpgradeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AvatarUpgradeReq.proto\"G\n\020AvatarUpgrad" +
      "eReq\022\017\n\007item_id\030\005 \001(\r\022\023\n\013avatar_guid\030\n \001" +
      "(\004\022\r\n\005count\030\001 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarUpgradeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarUpgradeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarUpgradeReq_descriptor,
        new java.lang.String[] { "ItemId", "AvatarGuid", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
