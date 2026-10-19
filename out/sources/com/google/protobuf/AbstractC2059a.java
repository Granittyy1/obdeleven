package com.google.protobuf;

import com.google.protobuf.AbstractC2059a;
import com.google.protobuf.AbstractC2059a.AbstractC0291a;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2059a<MessageType extends AbstractC2059a<MessageType, BuilderType>, BuilderType extends AbstractC0291a<MessageType, BuilderType>> implements J {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0291a<MessageType extends AbstractC2059a<MessageType, BuilderType>, BuilderType extends AbstractC0291a<MessageType, BuilderType>> implements K, Cloneable {
    }

    public static void k(List list, List list2) {
        Charset charset = C2078u.f29200a;
        list.getClass();
        if (list instanceof InterfaceC2083z) {
            List<?> listJ = ((InterfaceC2083z) list).j();
            InterfaceC2083z interfaceC2083z = (InterfaceC2083z) list2;
            int size = list2.size();
            for (Object obj : listJ) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2083z.size() - size) + " is null.";
                    for (int size2 = interfaceC2083z.size() - 1; size2 >= size; size2--) {
                        interfaceC2083z.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    interfaceC2083z.u((ByteString) obj);
                } else {
                    interfaceC2083z.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof T) {
            list2.addAll(list);
            return;
        }
        if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    @Override // com.google.protobuf.J
    public final ByteString b() {
        try {
            int iQ = ((GeneratedMessageLite) this).q(null);
            ByteString byteString = ByteString.f29007b;
            byte[] bArr = new byte[iQ];
            Logger logger = CodedOutputStream.f29012b;
            CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, 0, iQ);
            ((GeneratedMessageLite) this).g(bVar);
            if (bVar.W() == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(r("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.J
    public final void f(OutputStream outputStream) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int iQ = generatedMessageLite.q(null);
        Logger logger = CodedOutputStream.f29012b;
        if (iQ > 4096) {
            iQ = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(outputStream, iQ);
        generatedMessageLite.g(cVar);
        if (cVar.f29017f > 0) {
            cVar.b0();
        }
    }

    @Override // com.google.protobuf.J
    public final byte[] n() {
        try {
            int iQ = ((GeneratedMessageLite) this).q(null);
            byte[] bArr = new byte[iQ];
            Logger logger = CodedOutputStream.f29012b;
            CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, 0, iQ);
            ((GeneratedMessageLite) this).g(bVar);
            if (bVar.W() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(r("byte array"), e10);
        }
    }

    public int p() {
        throw new UnsupportedOperationException();
    }

    public int q(X x10) {
        int iP = p();
        if (iP != -1) {
            return iP;
        }
        int i10 = x10.i(this);
        s(i10);
        return i10;
    }

    public final String r(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void s(int i10) {
        throw new UnsupportedOperationException();
    }
}
