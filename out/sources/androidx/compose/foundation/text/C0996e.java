package androidx.compose.foundation.text;

import androidx.compose.ui.text.C1260a;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.foundation.text.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0996e {
    public static void a(C1260a.b bVar, String str) {
        if ("�".length() <= 0) {
            p245u.c.a("alternateText can't be an empty string.");
        }
        bVar.getClass();
        C1260a.b.C0161a c0161a = new C1260a.b.C0161a(new androidx.compose.ui.text.x(str), bVar.f15411b.length(), 0, "androidx.compose.foundation.text.inlineContent", 4);
        ArrayList arrayList = bVar.f15412c;
        arrayList.add(c0161a);
        bVar.f15413d.add(c0161a);
        arrayList.size();
        bVar.c("�");
        bVar.d();
    }
}
