package com.braze.ui.contentcards.view;

import android.view.View;
import com.braze.models.cards.Card;
import com.braze.ui.actions.UriAction;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import p110i9.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24412e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f24409b = i10;
        this.f24410c = obj;
        this.f24411d = obj2;
        this.f24412e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24409b) {
            case 0:
                BaseContentCardView.bindViewHolder$lambda$0((BaseContentCardView) this.f24410c, (Card) this.f24411d, (UriAction) this.f24412e, view);
                break;
            default:
                c.a<T> aVar = ((com.voltasit.obdeleven.presentation.controlUnit.eeprom.a) this.f24410c).f36781c;
                View view2 = ((com.voltasit.obdeleven.presentation.controlUnit.eeprom.a.C0333a) this.f24411d).itemView;
                aVar.d((EepromFragment.EepromData) this.f24412e);
                break;
        }
    }
}
