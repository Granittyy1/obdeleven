package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.ui.text.C1260a;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1224i implements InterfaceC1209a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f15050a;

    public C1224i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f15050a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.InterfaceC1209a0
    public final void a(C1260a c1260a) {
        List list = c1260a.f15409d;
        if (list == null) {
            list = EmptyList.f42983b;
        }
        boolean zIsEmpty = list.isEmpty();
        CharSequence charSequence = c1260a.f15408c;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            C1225i0 c1225i0 = new C1225i0();
            c1225i0.f15051a = Parcel.obtain();
            List list2 = c1260a.f15409d;
            if (list2 == null) {
                list2 = EmptyList.f42983b;
            }
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1260a.c cVar = (C1260a.c) list2.get(i10);
                androidx.compose.ui.text.v vVar = (androidx.compose.ui.text.v) cVar.f15418a;
                c1225i0.f15051a.recycle();
                c1225i0.f15051a = Parcel.obtain();
                long jC = vVar.f15690a.c();
                long j = androidx.compose.ui.graphics.H.f13504l;
                if (!androidx.compose.ui.graphics.H.c(jC, j)) {
                    c1225i0.a((byte) 1);
                    c1225i0.f15051a.writeLong(vVar.f15690a.c());
                }
                long j10 = p013b0.n.f20493c;
                long j11 = vVar.f15691b;
                byte b10 = 2;
                if (!p013b0.n.a(j11, j10)) {
                    c1225i0.a((byte) 2);
                    c1225i0.c(j11);
                }
                androidx.compose.ui.text.font.l lVar = vVar.f15692c;
                if (lVar != null) {
                    c1225i0.a((byte) 3);
                    c1225i0.f15051a.writeInt(lVar.f15447b);
                }
                androidx.compose.ui.text.font.j jVar = vVar.f15693d;
                if (jVar != null) {
                    c1225i0.a((byte) 4);
                    int i11 = jVar.f15436a;
                    c1225i0.a((!androidx.compose.ui.text.font.j.a(i11, 0) && androidx.compose.ui.text.font.j.a(i11, 1)) ? (byte) 1 : (byte) 0);
                }
                androidx.compose.ui.text.font.k kVar = vVar.f15694e;
                if (kVar != null) {
                    c1225i0.a((byte) 5);
                    int i12 = kVar.f15437a;
                    if (androidx.compose.ui.text.font.k.a(i12, 0)) {
                        b10 = 0;
                    } else if (androidx.compose.ui.text.font.k.a(i12, 65535)) {
                        b10 = 1;
                    } else if (!androidx.compose.ui.text.font.k.a(i12, 1)) {
                        if (androidx.compose.ui.text.font.k.a(i12, 2)) {
                            b10 = 3;
                        } else {
                            b10 = 0;
                        }
                    }
                    c1225i0.a(b10);
                }
                String str = vVar.f15696g;
                if (str != null) {
                    c1225i0.a((byte) 6);
                    c1225i0.f15051a.writeString(str);
                }
                long j12 = vVar.f15697h;
                if (!p013b0.n.a(j12, j10)) {
                    c1225i0.a((byte) 7);
                    c1225i0.c(j12);
                }
                androidx.compose.ui.text.style.a aVar = vVar.f15698i;
                if (aVar != null) {
                    c1225i0.a((byte) 8);
                    c1225i0.b(aVar.f15654a);
                }
                androidx.compose.ui.text.style.j jVar2 = vVar.j;
                if (jVar2 != null) {
                    c1225i0.a((byte) 9);
                    c1225i0.b(jVar2.f15676a);
                    c1225i0.b(jVar2.f15677b);
                }
                long j13 = vVar.f15700l;
                if (!androidx.compose.ui.graphics.H.c(j13, j)) {
                    c1225i0.a((byte) 10);
                    c1225i0.f15051a.writeLong(j13);
                }
                androidx.compose.ui.text.style.h hVar = vVar.f15701m;
                if (hVar != null) {
                    c1225i0.a((byte) 11);
                    c1225i0.f15051a.writeInt(hVar.f15673a);
                }
                androidx.compose.ui.graphics.k0 k0Var = vVar.f15702n;
                if (k0Var != null) {
                    c1225i0.a((byte) 12);
                    c1225i0.f15051a.writeLong(k0Var.f13653a);
                    long j14 = k0Var.f13654b;
                    c1225i0.b(Float.intBitsToFloat((int) (j14 >> 32)));
                    c1225i0.b(Float.intBitsToFloat((int) (j14 & 4294967295L)));
                    c1225i0.b(k0Var.f13655c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(c1225i0.f15051a.marshall(), 0)), cVar.f15419b, cVar.f15420c, 33);
            }
            charSequence = spannableString;
        }
        this.f15050a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
