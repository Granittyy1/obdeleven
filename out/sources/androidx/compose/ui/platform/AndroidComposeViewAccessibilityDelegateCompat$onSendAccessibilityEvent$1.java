package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends Lambda implements Ia.l<AccessibilityEvent, Boolean> {
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // Ia.l
    public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
        return Boolean.valueOf(this.this$0.f14746a.getParent().requestSendAccessibilityEvent(this.this$0.f14746a, accessibilityEvent));
    }
}
