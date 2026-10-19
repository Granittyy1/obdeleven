package com.braze.ui.widget;

import G8.C0705g;
import Ia.l;
import android.view.View;
import com.braze.models.cards.CaptionedImageCard;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24451d;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f24449b = i10;
        this.f24450c = obj;
        this.f24451d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24449b) {
            case 0:
                ((CaptionedImageCardView) this.f24450c).lambda$onSetCard$0((CaptionedImageCard) this.f24451d, view);
                break;
            default:
                l onClick = (l) this.f24450c;
                i.e(onClick, "$onClick");
                C0705g country = (C0705g) this.f24451d;
                i.e(country, "$country");
                onClick.invoke(country);
                break;
        }
    }
}
