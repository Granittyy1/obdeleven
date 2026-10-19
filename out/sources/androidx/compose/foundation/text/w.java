package androidx.compose.foundation.text;

import androidx.compose.ui.text.AndroidParagraph;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11633a = kotlin.text.m.F(10, "H");

    public static final long a(androidx.compose.ui.text.F f10, p013b0.c cVar, androidx.compose.ui.text.font.d.a aVar, String str, int i10) {
        AndroidParagraph androidParagraphA = androidx.compose.ui.text.m.a(str, f10, p013b0.b.b(0, 0, 15), cVar, aVar, EmptyList.f42983b, i10, 64);
        return (((long) s.a(androidParagraphA.f15285a.b())) << 32) | (((long) s.a(androidParagraphA.d())) & 4294967295L);
    }
}
