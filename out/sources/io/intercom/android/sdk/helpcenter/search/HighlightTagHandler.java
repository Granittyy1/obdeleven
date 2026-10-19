package io.intercom.android.sdk.helpcenter.search;

import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: HighlightTagHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HighlightTagHandler implements Html.TagHandler {
    private static final int SPAN_FLAG = 33;
    private int endIndex;
    private int startIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: HighlightTagHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void applyColorSpan(Editable editable) {
        editable.setSpan(new StyleSpan(1), this.startIndex, this.endIndex, 33);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z10, String tag, Editable output, XMLReader xmlReader) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(output, "output");
        kotlin.jvm.internal.i.e(xmlReader, "xmlReader");
        if (tag.equalsIgnoreCase("highlight")) {
            if (z10) {
                this.startIndex = output.length();
            } else {
                this.endIndex = output.length();
                applyColorSpan(output);
            }
        }
    }
}
