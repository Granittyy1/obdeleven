package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AbstractComposeView;

/* JADX INFO: compiled from: IntercomPrimaryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPrimaryButton extends AbstractComposeView {
    public static final int $stable = 0;
    private final androidx.compose.runtime.X onClick$delegate;
    private final androidx.compose.runtime.X text$delegate;
    private final androidx.compose.runtime.X trailingIconId$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r Content$lambda$1(IntercomPrimaryButton tmp0_rcvr, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(tmp0_rcvr, "$tmp0_rcvr");
        tmp0_rcvr.Content(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(346924157);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomPrimaryButtonKt.IntercomPrimaryButton(getText(), null, getTrailingIconId(), getOnClick(), c1086gP, 0, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.v0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButton.Content$lambda$1(this.f38421b, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    public final Ia.a<p293xa.r> getOnClick() {
        return (Ia.a) this.onClick$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getText() {
        return (String) this.text$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTrailingIconId() {
        return (Integer) this.trailingIconId$delegate.getValue();
    }

    public final void setOnClick(Ia.a<p293xa.r> aVar) {
        kotlin.jvm.internal.i.e(aVar, "<set-?>");
        this.onClick$delegate.setValue(aVar);
    }

    public final void setText(String str) {
        kotlin.jvm.internal.i.e(str, "<set-?>");
        this.text$delegate.setValue(str);
    }

    public final void setTrailingIconId(Integer num) {
        this.trailingIconId$delegate.setValue(num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.e eVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.i.e(context, "context");
        this.text$delegate = androidx.compose.runtime.J0.f("");
        this.onClick$delegate = androidx.compose.runtime.J0.f(new R9.a(1));
        this.trailingIconId$delegate = androidx.compose.runtime.J0.f(null);
    }
}
