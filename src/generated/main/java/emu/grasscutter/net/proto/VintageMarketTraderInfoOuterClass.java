// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketTraderInfo.proto

package emu.grasscutter.net.proto;

public final class VintageMarketTraderInfoOuterClass {
  private VintageMarketTraderInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketTraderInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketTraderInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getHiiflfhdkkgList();
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getHiiflfhdkkg(int index);
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    int getHiiflfhdkkgCount();
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getHiiflfhdkkgOrBuilderList();
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getHiiflfhdkkgOrBuilder(
        int index);

    /**
     * <code>uint32 traderId = 6;</code>
     * @return The traderId.
     */
    int getTraderId();
  }
  /**
   * Protobuf type {@code VintageMarketTraderInfo}
   */
  public static final class VintageMarketTraderInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketTraderInfo)
      VintageMarketTraderInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketTraderInfo.newBuilder() to construct.
    private VintageMarketTraderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketTraderInfo() {
      hiiflfhdkkg_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketTraderInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketTraderInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 48: {

              traderId_ = input.readUInt32();
              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                hiiflfhdkkg_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              hiiflfhdkkg_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          hiiflfhdkkg_ = java.util.Collections.unmodifiableList(hiiflfhdkkg_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.class, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder.class);
    }

    public static final int HIIFLFHDKKG_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> hiiflfhdkkg_;
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getHiiflfhdkkgList() {
      return hiiflfhdkkg_;
    }
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getHiiflfhdkkgOrBuilderList() {
      return hiiflfhdkkg_;
    }
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    @java.lang.Override
    public int getHiiflfhdkkgCount() {
      return hiiflfhdkkg_.size();
    }
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getHiiflfhdkkg(int index) {
      return hiiflfhdkkg_.get(index);
    }
    /**
     * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getHiiflfhdkkgOrBuilder(
        int index) {
      return hiiflfhdkkg_.get(index);
    }

    public static final int TRADERID_FIELD_NUMBER = 6;
    private int traderId_;
    /**
     * <code>uint32 traderId = 6;</code>
     * @return The traderId.
     */
    @java.lang.Override
    public int getTraderId() {
      return traderId_;
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
      if (traderId_ != 0) {
        output.writeUInt32(6, traderId_);
      }
      for (int i = 0; i < hiiflfhdkkg_.size(); i++) {
        output.writeMessage(10, hiiflfhdkkg_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (traderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, traderId_);
      }
      for (int i = 0; i < hiiflfhdkkg_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, hiiflfhdkkg_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo other = (emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) obj;

      if (!getHiiflfhdkkgList()
          .equals(other.getHiiflfhdkkgList())) return false;
      if (getTraderId()
          != other.getTraderId()) return false;
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
      if (getHiiflfhdkkgCount() > 0) {
        hash = (37 * hash) + HIIFLFHDKKG_FIELD_NUMBER;
        hash = (53 * hash) + getHiiflfhdkkgList().hashCode();
      }
      hash = (37 * hash) + TRADERID_FIELD_NUMBER;
      hash = (53 * hash) + getTraderId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo prototype) {
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
     * Protobuf type {@code VintageMarketTraderInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketTraderInfo)
        emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.class, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.newBuilder()
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
          getHiiflfhdkkgFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (hiiflfhdkkgBuilder_ == null) {
          hiiflfhdkkg_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          hiiflfhdkkgBuilder_.clear();
        }
        traderId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo build() {
        emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo buildPartial() {
        emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo result = new emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo(this);
        int from_bitField0_ = bitField0_;
        if (hiiflfhdkkgBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            hiiflfhdkkg_ = java.util.Collections.unmodifiableList(hiiflfhdkkg_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.hiiflfhdkkg_ = hiiflfhdkkg_;
        } else {
          result.hiiflfhdkkg_ = hiiflfhdkkgBuilder_.build();
        }
        result.traderId_ = traderId_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo other) {
        if (other == emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance()) return this;
        if (hiiflfhdkkgBuilder_ == null) {
          if (!other.hiiflfhdkkg_.isEmpty()) {
            if (hiiflfhdkkg_.isEmpty()) {
              hiiflfhdkkg_ = other.hiiflfhdkkg_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureHiiflfhdkkgIsMutable();
              hiiflfhdkkg_.addAll(other.hiiflfhdkkg_);
            }
            onChanged();
          }
        } else {
          if (!other.hiiflfhdkkg_.isEmpty()) {
            if (hiiflfhdkkgBuilder_.isEmpty()) {
              hiiflfhdkkgBuilder_.dispose();
              hiiflfhdkkgBuilder_ = null;
              hiiflfhdkkg_ = other.hiiflfhdkkg_;
              bitField0_ = (bitField0_ & ~0x00000001);
              hiiflfhdkkgBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getHiiflfhdkkgFieldBuilder() : null;
            } else {
              hiiflfhdkkgBuilder_.addAllMessages(other.hiiflfhdkkg_);
            }
          }
        }
        if (other.getTraderId() != 0) {
          setTraderId(other.getTraderId());
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
        emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> hiiflfhdkkg_ =
        java.util.Collections.emptyList();
      private void ensureHiiflfhdkkgIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          hiiflfhdkkg_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(hiiflfhdkkg_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> hiiflfhdkkgBuilder_;

      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getHiiflfhdkkgList() {
        if (hiiflfhdkkgBuilder_ == null) {
          return java.util.Collections.unmodifiableList(hiiflfhdkkg_);
        } else {
          return hiiflfhdkkgBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public int getHiiflfhdkkgCount() {
        if (hiiflfhdkkgBuilder_ == null) {
          return hiiflfhdkkg_.size();
        } else {
          return hiiflfhdkkgBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getHiiflfhdkkg(int index) {
        if (hiiflfhdkkgBuilder_ == null) {
          return hiiflfhdkkg_.get(index);
        } else {
          return hiiflfhdkkgBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder setHiiflfhdkkg(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (hiiflfhdkkgBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.set(index, value);
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder setHiiflfhdkkg(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (hiiflfhdkkgBuilder_ == null) {
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.set(index, builderForValue.build());
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder addHiiflfhdkkg(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (hiiflfhdkkgBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.add(value);
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder addHiiflfhdkkg(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (hiiflfhdkkgBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.add(index, value);
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder addHiiflfhdkkg(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (hiiflfhdkkgBuilder_ == null) {
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.add(builderForValue.build());
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder addHiiflfhdkkg(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (hiiflfhdkkgBuilder_ == null) {
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.add(index, builderForValue.build());
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder addAllHiiflfhdkkg(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (hiiflfhdkkgBuilder_ == null) {
          ensureHiiflfhdkkgIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, hiiflfhdkkg_);
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder clearHiiflfhdkkg() {
        if (hiiflfhdkkgBuilder_ == null) {
          hiiflfhdkkg_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public Builder removeHiiflfhdkkg(int index) {
        if (hiiflfhdkkgBuilder_ == null) {
          ensureHiiflfhdkkgIsMutable();
          hiiflfhdkkg_.remove(index);
          onChanged();
        } else {
          hiiflfhdkkgBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getHiiflfhdkkgBuilder(
          int index) {
        return getHiiflfhdkkgFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getHiiflfhdkkgOrBuilder(
          int index) {
        if (hiiflfhdkkgBuilder_ == null) {
          return hiiflfhdkkg_.get(index);  } else {
          return hiiflfhdkkgBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getHiiflfhdkkgOrBuilderList() {
        if (hiiflfhdkkgBuilder_ != null) {
          return hiiflfhdkkgBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(hiiflfhdkkg_);
        }
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addHiiflfhdkkgBuilder() {
        return getHiiflfhdkkgFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addHiiflfhdkkgBuilder(
          int index) {
        return getHiiflfhdkkgFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam hiiflfhdkkg = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getHiiflfhdkkgBuilderList() {
        return getHiiflfhdkkgFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getHiiflfhdkkgFieldBuilder() {
        if (hiiflfhdkkgBuilder_ == null) {
          hiiflfhdkkgBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  hiiflfhdkkg_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          hiiflfhdkkg_ = null;
        }
        return hiiflfhdkkgBuilder_;
      }

      private int traderId_ ;
      /**
       * <code>uint32 traderId = 6;</code>
       * @return The traderId.
       */
      @java.lang.Override
      public int getTraderId() {
        return traderId_;
      }
      /**
       * <code>uint32 traderId = 6;</code>
       * @param value The traderId to set.
       * @return This builder for chaining.
       */
      public Builder setTraderId(int value) {
        
        traderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 traderId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraderId() {
        
        traderId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketTraderInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketTraderInfo)
    private static final emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo();
    }

    public static emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketTraderInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketTraderInfo>() {
      @java.lang.Override
      public VintageMarketTraderInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketTraderInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketTraderInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketTraderInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketTraderInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketTraderInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035VintageMarketTraderInfo.proto\032\017ItemPar" +
      "am.proto\"L\n\027VintageMarketTraderInfo\022\037\n\013h" +
      "iiflfhdkkg\030\n \003(\0132\n.ItemParam\022\020\n\010traderId" +
      "\030\006 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_VintageMarketTraderInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketTraderInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketTraderInfo_descriptor,
        new java.lang.String[] { "Hiiflfhdkkg", "TraderId", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
