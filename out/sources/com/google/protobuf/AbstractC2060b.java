package com.google.protobuf;

import com.google.protobuf.J;
import java.io.FileInputStream;

/* JADX INFO: renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2060b<MessageType extends J> implements S<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2071m f29133a = C2071m.a();

    public static void c(J j) throws InvalidProtocolBufferException {
        if (j.d()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException((j instanceof AbstractC2059a ? new UninitializedMessageException() : new UninitializedMessageException()).getMessage());
        invalidProtocolBufferException.g(j);
        throw invalidProtocolBufferException;
    }

    @Override // com.google.protobuf.S
    public final J a(AbstractC2066h abstractC2066h) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteD = ((GeneratedMessageLite.b) this).d(abstractC2066h, H9.b.f3744a);
        c(generatedMessageLiteD);
        return generatedMessageLiteD;
    }

    @Override // com.google.protobuf.S
    public final J b(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        AbstractC2066h bVar;
        if (fileInputStream == null) {
            byte[] bArr = C2078u.f29201b;
            bVar = AbstractC2066h.d(bArr, 0, bArr.length, false);
        } else {
            bVar = new AbstractC2066h.b(fileInputStream);
        }
        GeneratedMessageLite generatedMessageLiteD = ((GeneratedMessageLite.b) this).d(bVar, f29133a);
        try {
            bVar.a(0);
            c(generatedMessageLiteD);
            return generatedMessageLiteD;
        } catch (InvalidProtocolBufferException e10) {
            e10.g(generatedMessageLiteD);
            throw e10;
        }
    }
}
