package androidx.compose.ui.text;

import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Paragraph.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static AndroidParagraph a(String str, F f10, long j, p013b0.c cVar, androidx.compose.ui.text.font.d.a aVar, EmptyList emptyList, int i10, int i11) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, f10, (i11 & 32) != 0 ? EmptyList.f42983b : emptyList, EmptyList.f42983b, aVar, cVar), i10, 1, j);
    }
}
