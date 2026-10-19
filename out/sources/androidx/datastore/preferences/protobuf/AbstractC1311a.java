package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1311a;
import androidx.datastore.preferences.protobuf.AbstractC1311a.AbstractC0178a;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1311a<MessageType extends AbstractC1311a<MessageType, BuilderType>, BuilderType extends AbstractC0178a<MessageType, BuilderType>> implements I {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0178a<MessageType extends AbstractC1311a<MessageType, BuilderType>, BuilderType extends AbstractC0178a<MessageType, BuilderType>> implements J, Cloneable {
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public final ByteString b() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int iC = generatedMessageLite.c();
            ByteString byteString = ByteString.f17095b;
            byte[] bArr = new byte[iC];
            Logger logger = CodedOutputStream.f17101b;
            CodedOutputStream.b bVar = new CodedOutputStream.b(iC, bArr);
            generatedMessageLite.e(bVar);
            if (bVar.f17108e - bVar.f17109f == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public final int h(X x10) {
        int iG = g();
        if (iG != -1) {
            return iG;
        }
        int iF = x10.f(this);
        i(iF);
        return iF;
    }

    public void i(int i10) {
        throw new UnsupportedOperationException();
    }
}
