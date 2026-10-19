package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1880p2;
import com.google.android.gms.internal.measurement.AbstractC1887q2;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1887q2<MessageType extends AbstractC1887q2<MessageType, BuilderType>, BuilderType extends AbstractC1880p2<MessageType, BuilderType>> implements InterfaceC1894r3 {
    protected int zza = 0;

    public static <T> void g(Iterable<T> iterable, List<? super T> list) {
        Charset charset = Q2.f25563a;
        iterable.getClass();
        if (iterable instanceof InterfaceC1790c3) {
            List<?> listZ = ((InterfaceC1790c3) iterable).z();
            InterfaceC1790c3 interfaceC1790c3 = (InterfaceC1790c3) list;
            int size = list.size();
            for (Object obj : listZ) {
                if (obj == null) {
                    String strC = J4.i.c(interfaceC1790c3.size() - size, "Element at index ", " is null.");
                    for (int size2 = interfaceC1790c3.size() - 1; size2 >= size; size2--) {
                        interfaceC1790c3.remove(size2);
                    }
                    throw new NullPointerException(strC);
                }
                if (obj instanceof zzij) {
                    interfaceC1790c3.H((zzij) obj);
                } else {
                    interfaceC1790c3.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof A3) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t8 : iterable) {
            if (t8 == null) {
                String strC2 = J4.i.c(list.size() - size3, "Element at index ", " is null.");
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(strC2);
            }
            list.add(t8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1894r3
    public final zzij d() {
        try {
            int iF = ((N2) this).f(null);
            zzij zzijVar = zzij.f26049b;
            byte[] bArr = new byte[iF];
            Logger logger = zzja.f26051d;
            zzja.a aVar = new zzja.a(iF, bArr);
            ((N2) this).a(aVar);
            if (aVar.D0() == 0) {
                return new zzit(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(androidx.compose.foundation.gestures.d.b("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public int f(E3 e10) {
        int iH = h();
        if (iH != -1) {
            return iH;
        }
        int i10 = e10.i(this);
        j(i10);
        return i10;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public final byte[] i() {
        try {
            int iF = ((N2) this).f(null);
            byte[] bArr = new byte[iF];
            Logger logger = zzja.f26051d;
            zzja.a aVar = new zzja.a(iF, bArr);
            ((N2) this).a(aVar);
            if (aVar.D0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(androidx.compose.foundation.gestures.d.b("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public void j(int i10) {
        throw new UnsupportedOperationException();
    }
}
