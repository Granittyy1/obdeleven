package com.voltasit.obdeleven.presentation.dialogs.bonus;

import Ia.l;
import K8.v;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.K;
import androidx.lifecycle.X;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.usecases.user.D;
import com.voltasit.obdeleven.presentation.d;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BonusDialogViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BonusDialogViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D f32202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.bonus.a f32203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f32204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K.a f32205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C<r> f32206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f32207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B f32208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B f32209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C<SubscriptionType> f32210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C<Boolean> f32211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C<Boolean> f32212y;

    /* JADX WARN: Multi-variable type inference failed */
    public BonusDialogViewModel(K k10, c bonusDialogParameters, D d10, com.voltasit.obdeleven.domain.usecases.bonus.a aVar, v vVar) {
        c cVar;
        i.e(bonusDialogParameters, "bonusDialogParameters");
        this.f32202o = d10;
        this.f32203p = aVar;
        this.f32204q = vVar;
        K.a aVarA = k10.a(bonusDialogParameters, "KEY_BONUS_DIALOG_PARAMS");
        this.f32205r = aVarA;
        C<r> c10 = new C<>();
        this.f32206s = c10;
        this.f32207t = c10;
        this.f32208u = X.a(aVarA, new l<c, Boolean>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel$showCreditCheckBox$1
            @Override // Ia.l
            public final Boolean invoke(c cVar2) {
                return Boolean.valueOf(cVar2.f32221d > 0);
            }
        });
        this.f32209v = X.a(aVarA, new l<c, Boolean>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel$isCreditsChecked$1
            @Override // Ia.l
            public final Boolean invoke(c cVar2) {
                return Boolean.valueOf(cVar2.f32221d > 0);
            }
        });
        c cVar2 = (c) aVarA.d();
        this.f32210w = new C<>(cVar2 != null ? cVar2.f32223f : null);
        c cVar3 = (c) aVarA.d();
        SubscriptionType subscriptionType = cVar3 != null ? cVar3.f32223f : null;
        SubscriptionType subscriptionType2 = SubscriptionType.None;
        this.f32211x = new C<>(Boolean.valueOf((subscriptionType == subscriptionType2 || (cVar = (c) aVarA.d()) == null || !cVar.f32222e) ? false : true));
        c cVar4 = (c) aVarA.d();
        this.f32212y = new C<>(Boolean.valueOf((cVar4 != null ? cVar4.f32223f : null) != subscriptionType2));
    }
}
