package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UnlockSfd2ProtectionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.UnlockSfd2ProtectionUC", f = "UnlockSfd2ProtectionUC.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall, R.styleable.AppCompatTheme_colorControlNormal, R.styleable.AppCompatTheme_controlBackground, R.styleable.AppCompatTheme_dialogPreferredPadding, R.styleable.AppCompatTheme_dropdownListPreferredItemHeight, R.styleable.AppCompatTheme_editTextColor, R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_listMenuViewStyle, R.styleable.AppCompatTheme_listPopupWindowStyle, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd, R.styleable.AppCompatTheme_listPreferredItemPaddingRight}, m = "invoke")
final class UnlockSfd2ProtectionUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockSfd2ProtectionUC$invoke$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
