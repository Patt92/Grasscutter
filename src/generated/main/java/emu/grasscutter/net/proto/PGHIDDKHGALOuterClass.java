// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PGHIDDKHGAL.proto

package emu.grasscutter.net.proto;

public final class PGHIDDKHGALOuterClass {
  private PGHIDDKHGALOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PGHIDDKHGALOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PGHIDDKHGAL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CDMINANDFKE = 1;</code>
     * @return The cDMINANDFKE.
     */
    int getCDMINANDFKE();
  }
  /**
   * <pre>
   * Name: PGHIDDKHGAL
   * </pre>
   *
   * Protobuf type {@code PGHIDDKHGAL}
   */
  public static final class PGHIDDKHGAL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PGHIDDKHGAL)
      PGHIDDKHGALOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PGHIDDKHGAL.newBuilder() to construct.
    private PGHIDDKHGAL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PGHIDDKHGAL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PGHIDDKHGAL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PGHIDDKHGAL(
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

              cDMINANDFKE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.internal_static_PGHIDDKHGAL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.internal_static_PGHIDDKHGAL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.class, emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.Builder.class);
    }

    public static final int CDMINANDFKE_FIELD_NUMBER = 1;
    private int cDMINANDFKE_;
    /**
     * <code>uint32 CDMINANDFKE = 1;</code>
     * @return The cDMINANDFKE.
     */
    @java.lang.Override
    public int getCDMINANDFKE() {
      return cDMINANDFKE_;
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
      if (cDMINANDFKE_ != 0) {
        output.writeUInt32(1, cDMINANDFKE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cDMINANDFKE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cDMINANDFKE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL other = (emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL) obj;

      if (getCDMINANDFKE()
          != other.getCDMINANDFKE()) return false;
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
      hash = (37 * hash) + CDMINANDFKE_FIELD_NUMBER;
      hash = (53 * hash) + getCDMINANDFKE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL prototype) {
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
     * Name: PGHIDDKHGAL
     * </pre>
     *
     * Protobuf type {@code PGHIDDKHGAL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PGHIDDKHGAL)
        emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGALOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.internal_static_PGHIDDKHGAL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.internal_static_PGHIDDKHGAL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.class, emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.newBuilder()
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
        cDMINANDFKE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.internal_static_PGHIDDKHGAL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL build() {
        emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL buildPartial() {
        emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL result = new emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL(this);
        result.cDMINANDFKE_ = cDMINANDFKE_;
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
        if (other instanceof emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL) {
          return mergeFrom((emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL other) {
        if (other == emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL.getDefaultInstance()) return this;
        if (other.getCDMINANDFKE() != 0) {
          setCDMINANDFKE(other.getCDMINANDFKE());
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
        emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cDMINANDFKE_ ;
      /**
       * <code>uint32 CDMINANDFKE = 1;</code>
       * @return The cDMINANDFKE.
       */
      @java.lang.Override
      public int getCDMINANDFKE() {
        return cDMINANDFKE_;
      }
      /**
       * <code>uint32 CDMINANDFKE = 1;</code>
       * @param value The cDMINANDFKE to set.
       * @return This builder for chaining.
       */
      public Builder setCDMINANDFKE(int value) {
        
        cDMINANDFKE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CDMINANDFKE = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCDMINANDFKE() {
        
        cDMINANDFKE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PGHIDDKHGAL)
    }

    // @@protoc_insertion_point(class_scope:PGHIDDKHGAL)
    private static final emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL();
    }

    public static emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PGHIDDKHGAL>
        PARSER = new com.google.protobuf.AbstractParser<PGHIDDKHGAL>() {
      @java.lang.Override
      public PGHIDDKHGAL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PGHIDDKHGAL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PGHIDDKHGAL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PGHIDDKHGAL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PGHIDDKHGALOuterClass.PGHIDDKHGAL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PGHIDDKHGAL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PGHIDDKHGAL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PGHIDDKHGAL.proto\"\"\n\013PGHIDDKHGAL\022\023\n\013CD" +
      "MINANDFKE\030\001 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PGHIDDKHGAL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PGHIDDKHGAL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PGHIDDKHGAL_descriptor,
        new java.lang.String[] { "CDMINANDFKE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
