package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlinx.coroutines.B;
import p293xa.r;

/* JADX INFO: loaded from: classes3.dex */
public class CardWebView extends WebView {
    public CardWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r lambda$setUp$0(IntercomEvent intercomEvent) {
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            reload();
        }
        return r.f47939a;
    }

    public void setUp() {
        Injector.get().getDataLayer().listenToEvents(B.b(), new a(0, this));
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
