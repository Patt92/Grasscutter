// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusTrainingDungeonDetail.proto

package emu.grasscutter.net.proto;

public final class FungusTrainingDungeonDetailOuterClass {
  private FungusTrainingDungeonDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusTrainingDungeonDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusTrainingDungeonDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 best_score = 12;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 dungeon_id = 14;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Obf: AJMJIIEAGNF
   * </pre>
   *
   * Protobuf type {@code FungusTrainingDungeonDetail}
   */
  public static final class FungusTrainingDungeonDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusTrainingDungeonDetail)
      FungusTrainingDungeonDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusTrainingDungeonDetail.newBuilder() to construct.
    private FungusTrainingDungeonDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusTrainingDungeonDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusTrainingDungeonDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusTrainingDungeonDetail(
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

              isOpen_ = input.readBool();
              break;
            }
            case 96: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 112: {

              dungeonId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.class, emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.Builder.class);
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 12;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 12;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 14;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 14;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 2;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isOpen_ != false) {
        output.writeBool(2, isOpen_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(12, bestScore_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(14, dungeonId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOpen_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, bestScore_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail other = (emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail) obj;

      if (getBestScore()
          != other.getBestScore()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail prototype) {
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
     * Obf: AJMJIIEAGNF
     * </pre>
     *
     * Protobuf type {@code FungusTrainingDungeonDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusTrainingDungeonDetail)
        emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.class, emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.newBuilder()
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
        bestScore_ = 0;

        dungeonId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail build() {
        emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail buildPartial() {
        emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail result = new emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail(this);
        result.bestScore_ = bestScore_;
        result.dungeonId_ = dungeonId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail) {
          return mergeFrom((emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail other) {
        if (other == emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.getDefaultInstance()) return this;
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 12;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 12;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 14;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 14;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 2;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:FungusTrainingDungeonDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusTrainingDungeonDetail)
    private static final emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail();
    }

    public static emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusTrainingDungeonDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusTrainingDungeonDetail>() {
      @java.lang.Override
      public FungusTrainingDungeonDetail parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusTrainingDungeonDetail(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusTrainingDungeonDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusTrainingDungeonDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusTrainingDungeonDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusTrainingDungeonDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FungusTrainingDungeonDetail.proto\"V\n\033F" +
      "ungusTrainingDungeonDetail\022\022\n\nbest_score" +
      "\030\014 \001(\r\022\022\n\ndungeon_id\030\016 \001(\r\022\017\n\007is_open\030\002 " +
      "\001(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusTrainingDungeonDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusTrainingDungeonDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusTrainingDungeonDetail_descriptor,
        new java.lang.String[] { "BestScore", "DungeonId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
