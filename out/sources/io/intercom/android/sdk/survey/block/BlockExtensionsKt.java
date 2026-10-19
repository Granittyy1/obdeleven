package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.C;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.InterfaceC1267h;
import com.braze.Constants;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: BlockExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockExtensionsKt {
    private static final void appendStringWithLink(C1260a.b bVar, androidx.compose.ui.text.v vVar, final Context context, Spanned spanned) {
        int i10 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i11 = 0;
        while (i10 < length) {
            final URLSpan uRLSpan = uRLSpanArr[i10];
            AbstractC1266g.a aVar = new AbstractC1266g.a(Constants.BRAZE_WEBVIEW_URL_EXTRA, new C(vVar, 14), new InterfaceC1267h() { // from class: io.intercom.android.sdk.survey.block.d
                @Override // androidx.compose.ui.text.InterfaceC1267h
                public final void a(AbstractC1266g abstractC1266g) {
                    BlockExtensionsKt.appendStringWithLink$lambda$8$lambda$6(uRLSpan, context, abstractC1266g);
                }
            });
            int spanStart = spanned.getSpanStart(uRLSpan);
            int spanEnd = spanned.getSpanEnd(uRLSpan);
            if (spanStart > i11) {
                bVar.c(spanned.subSequence(i11, spanStart).toString());
            }
            int iF = bVar.f(aVar);
            try {
                bVar.c(spanned.subSequence(spanStart, spanEnd).toString());
                p293xa.r rVar = p293xa.r.f47939a;
                bVar.e(iF);
                i10++;
                i11 = spanEnd;
            } catch (Throwable th) {
                bVar.e(iF);
                throw th;
            }
        }
        if (i11 < spanned.length()) {
            bVar.c(spanned.subSequence(i11, spanned.length()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendStringWithLink$lambda$8$lambda$6(URLSpan urlSpan, Context context, AbstractC1266g it) {
        kotlin.jvm.internal.i.e(urlSpan, "$urlSpan");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(it, "it");
        String url = urlSpan.getURL();
        kotlin.jvm.internal.i.d(url, "getURL(...)");
        if (kotlin.text.n.S(url)) {
            return;
        }
        LinkOpener.handleUrl(urlSpan.getURL(), context, Injector.get().getApi());
    }

    public static final int getTextAlign(BlockAlignment blockAlignment) {
        kotlin.jvm.internal.i.e(blockAlignment, "<this>");
        int gravity = blockAlignment.getGravity();
        if (gravity != 1) {
            return (gravity == 8388611 || gravity != 8388613) ? 5 : 6;
        }
        return 3;
    }

    public static final C1260a toAnnotatedString(CharSequence charSequence, Context context, androidx.compose.ui.text.v urlSpanStyle) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(urlSpanStyle, "urlSpanStyle");
        if (!(charSequence instanceof Spanned)) {
            C1260a.b bVar = new C1260a.b();
            bVar.c(bVar.toString());
            return bVar.i();
        }
        C1260a.b bVar2 = new C1260a.b();
        Spanned spanned = (Spanned) charSequence;
        StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spanned.getSpans(0, spanned.length(), UnderlineSpan.class);
        StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) spanned.getSpans(0, spanned.length(), StrikethroughSpan.class);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class);
        appendStringWithLink(bVar2, urlSpanStyle, context, spanned);
        for (StyleSpan styleSpan : styleSpanArr) {
            int spanStart = spanned.getSpanStart(styleSpan);
            int spanEnd = spanned.getSpanEnd(styleSpan);
            int style = styleSpan.getStyle();
            if (style == 1) {
                bVar2.a(new androidx.compose.ui.text.v(0L, 0L, androidx.compose.ui.text.font.l.j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), spanStart, spanEnd);
            } else if (style == 2) {
                bVar2.a(new androidx.compose.ui.text.v(0L, 0L, null, new androidx.compose.ui.text.font.j(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527), spanStart, spanEnd);
            } else if (style == 3) {
                bVar2.a(new androidx.compose.ui.text.v(0L, 0L, androidx.compose.ui.text.font.l.j, new androidx.compose.ui.text.font.j(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523), spanStart, spanEnd);
            }
        }
        for (UnderlineSpan underlineSpan : underlineSpanArr) {
            bVar2.a(new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439), spanned.getSpanStart(underlineSpan), spanned.getSpanEnd(underlineSpan));
        }
        for (StrikethroughSpan strikethroughSpan : strikethroughSpanArr) {
            bVar2.a(new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15672d, null, 61439), spanned.getSpanStart(strikethroughSpan), spanned.getSpanEnd(strikethroughSpan));
        }
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            bVar2.a(new androidx.compose.ui.text.v(Q3.d.d(foregroundColorSpan.getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan));
        }
        return bVar2.i();
    }
}
