package io.intercom.android.sdk.m5.home.ui;

import Ia.l;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.jvm.internal.i;
import p141l2.C;
import p141l2.C2748s;
import p141l2.E;
import p163n2.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39205b;

    public /* synthetic */ b(int i10) {
        this.f39205b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39205b) {
            case 0:
                return HomeContentScreenKt.HomeContentScreen$lambda$6((TicketType) obj);
            case 1:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$12((C2748s) obj);
            default:
                C it = (C) obj;
                i.e(it, "it");
                if (!(it instanceof E)) {
                    return null;
                }
                m mVar = ((E) it).f44235g;
                return mVar.a(mVar.f44821c);
        }
    }
}
