package p245u;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.platform.Y;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.font.j;
import androidx.compose.ui.text.font.k;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.style.h;
import androidx.compose.ui.text.v;
import java.util.List;
import kotlin.collections.EmptyList;
import p013b0.n;

/* JADX INFO: compiled from: ClipboardUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Y a(C1260a c1260a) {
        byte b10;
        List list = c1260a.f15409d;
        boolean zIsEmpty = (list == null ? EmptyList.f42983b : list).isEmpty();
        CharSequence charSequence = c1260a.f15408c;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            b bVar = new b();
            bVar.f47386a = Parcel.obtain();
            if (list == null) {
                list = EmptyList.f42983b;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1260a.c cVar = (C1260a.c) list.get(i10);
                v vVar = (v) cVar.f15418a;
                bVar.f47386a.recycle();
                bVar.f47386a = Parcel.obtain();
                long jC = vVar.f15690a.c();
                long j = H.f13504l;
                if (!H.c(jC, j)) {
                    bVar.a((byte) 1);
                    bVar.f47386a.writeLong(vVar.f15690a.c());
                }
                long j10 = n.f20493c;
                long j11 = vVar.f15691b;
                if (!n.a(j11, j10)) {
                    bVar.a((byte) 2);
                    bVar.c(j11);
                }
                l lVar = vVar.f15692c;
                if (lVar != null) {
                    bVar.a((byte) 3);
                    bVar.f47386a.writeInt(lVar.f15447b);
                }
                j jVar = vVar.f15693d;
                if (jVar != null) {
                    bVar.a((byte) 4);
                    int i11 = jVar.f15436a;
                    bVar.a((!j.a(i11, 0) && j.a(i11, 1)) ? (byte) 1 : (byte) 0);
                }
                k kVar = vVar.f15694e;
                if (kVar != null) {
                    bVar.a((byte) 5);
                    int i12 = kVar.f15437a;
                    if (k.a(i12, 0)) {
                        b10 = 0;
                    } else if (k.a(i12, 65535)) {
                        b10 = 1;
                    } else if (k.a(i12, 1)) {
                        b10 = 2;
                    } else if (k.a(i12, 2)) {
                        b10 = 3;
                    } else {
                        b10 = 0;
                    }
                    bVar.a(b10);
                }
                String str = vVar.f15696g;
                if (str != null) {
                    bVar.a((byte) 6);
                    bVar.f47386a.writeString(str);
                }
                long j12 = vVar.f15697h;
                if (!n.a(j12, j10)) {
                    bVar.a((byte) 7);
                    bVar.c(j12);
                }
                androidx.compose.ui.text.style.a aVar = vVar.f15698i;
                if (aVar != null) {
                    bVar.a((byte) 8);
                    bVar.b(aVar.f15654a);
                }
                androidx.compose.ui.text.style.j jVar2 = vVar.j;
                if (jVar2 != null) {
                    bVar.a((byte) 9);
                    bVar.b(jVar2.f15676a);
                    bVar.b(jVar2.f15677b);
                }
                long j13 = vVar.f15700l;
                if (!H.c(j13, j)) {
                    bVar.a((byte) 10);
                    bVar.f47386a.writeLong(j13);
                }
                h hVar = vVar.f15701m;
                if (hVar != null) {
                    bVar.a((byte) 11);
                    bVar.f47386a.writeInt(hVar.f15673a);
                }
                k0 k0Var = vVar.f15702n;
                if (k0Var != null) {
                    bVar.a((byte) 12);
                    bVar.f47386a.writeLong(k0Var.f13653a);
                    long j14 = k0Var.f13654b;
                    bVar.b(Float.intBitsToFloat((int) (j14 >> 32)));
                    bVar.b(Float.intBitsToFloat((int) (j14 & 4294967295L)));
                    bVar.b(k0Var.f13655c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(bVar.f47386a.marshall(), 0)), cVar.f15419b, cVar.f15420c, 33);
            }
            charSequence = spannableString;
        }
        return new Y(ClipData.newPlainText("plain text", charSequence));
    }
}
