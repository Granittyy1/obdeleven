package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Mac;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatEmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0858k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8998b;

    public C0858k(EditText editText) {
        this.f8997a = editText;
        this.f8998b = new T0.a(editText);
    }

    public byte[] a(char[] cArr, int i10) {
        cArr.getClass();
        byte[] bArr = new byte[cArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < cArr.length; i12++) {
            bArr[i12] = (byte) cArr[i12];
        }
        androidx.compose.runtime.snapshots.m mVar = (androidx.compose.runtime.snapshots.m) this.f8998b;
        p099hb.a aVar = (p099hb.a) this.f8997a;
        if (mVar == null) {
            this.f8998b = new androidx.compose.runtime.snapshots.m(aVar.f36270c);
        }
        ((androidx.compose.runtime.snapshots.m) this.f8998b).a(bArr);
        int i13 = i10 == 0 ? ((androidx.compose.runtime.snapshots.m) this.f8998b).f13217a : i10;
        androidx.compose.runtime.snapshots.m mVar2 = (androidx.compose.runtime.snapshots.m) this.f8998b;
        byte[] bArr2 = aVar.f36268a;
        int i14 = aVar.f36269b;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        int i15 = mVar2.f13217a;
        int i16 = 1;
        int i17 = (i13 / i15) + (i13 % i15 > 0 ? 1 : 0);
        int i18 = i13 - ((i17 - 1) * i15);
        byte[] bArr3 = new byte[i17 * i15];
        int i19 = 0;
        while (i16 <= i17) {
            int i20 = mVar2.f13217a;
            byte[] bArr4 = new byte[i20];
            byte[] bArrDoFinal = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, i11, bArrDoFinal, i11, bArr2.length);
            int length = bArr2.length;
            bArrDoFinal[length] = (byte) (i16 / 16777216);
            bArrDoFinal[length + 1] = (byte) (i16 / 65536);
            bArrDoFinal[length + 2] = (byte) (i16 / 256);
            bArrDoFinal[length + 3] = (byte) i16;
            for (int i21 = 0; i21 < i14; i21++) {
                bArrDoFinal = ((Mac) mVar2.f13218b).doFinal(bArrDoFinal);
                for (int i22 = 0; i22 < i20; i22++) {
                    bArr4[i22] = (byte) (bArr4[i22] ^ bArrDoFinal[i22]);
                }
            }
            System.arraycopy(bArr4, 0, bArr3, i19, i20);
            i19 += i15;
            i16++;
            i11 = 0;
        }
        int i23 = i11;
        if (i18 >= i15) {
            return bArr3;
        }
        byte[] bArr5 = new byte[i13];
        System.arraycopy(bArr3, i23, bArr5, i23, i13);
        return bArr5;
    }

    public KeyListener b(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((T0.a) this.f8998b).f5731a.getClass();
        if (keyListener instanceof T0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new T0.e(keyListener);
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f8997a).getContext().obtainStyledAttributes(attributeSet, p088h.a.f35697i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public T0.c d(InputConnection inputConnection, EditorInfo editorInfo) {
        T0.a aVar = (T0.a) this.f8998b;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            T0.a.C0081a c0081a = aVar.f5731a;
            c0081a.getClass();
            if (!(inputConnection instanceof T0.c)) {
                inputConnection = new T0.c(c0081a.f5732a, inputConnection, editorInfo);
            }
        }
        return (T0.c) inputConnection;
    }

    public void e(boolean z10) {
        T0.g gVar = ((T0.a) this.f8998b).f5731a.f5733b;
        if (gVar.f5752d != z10) {
            if (gVar.f5751c != null) {
                androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
                T0.g.a aVar = gVar.f5751c;
                cVarA.getClass();
                A0.f.f(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = cVarA.f17343a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    cVarA.f17344b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            gVar.f5752d = z10;
            if (z10) {
                T0.g.a(gVar.f5750b, androidx.emoji2.text.c.a().c());
            }
        }
    }
}
