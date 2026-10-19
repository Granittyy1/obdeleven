package p237t3;

import Q7.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.C0;
import com.google.android.gms.internal.play_billing.C1985l1;
import com.google.android.gms.internal.play_billing.C2013v0;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.J1;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class G extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f47141c;

    public G(H h8, boolean z10) {
        Objects.requireNonNull(h8);
        this.f47141c = h8;
        this.f47140b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f47139a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f47140b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f47139a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (this.f47139a) {
            context.unregisterReceiver(this);
            this.f47139a = false;
        } else {
            int i10 = C2018x.f26297a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    public final void c(Bundle bundle, a aVar, int i10, zzil zzilVar, long j, boolean z10) {
        C2013v0 c2013v0B;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                this.f47141c.f47144c.c(C.b(zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, aVar, null, zzilVar), j, z10);
                return;
            }
            c cVar = this.f47141c.f47144c;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            C2013v0 c2013v0 = C2013v0.f26276b;
            if (c2013v0 == null) {
                synchronized (C2013v0.class) {
                    try {
                        c2013v0B = C2013v0.f26276b;
                        if (c2013v0B == null) {
                            C1985l1 c1985l1 = C1985l1.f26210c;
                            c2013v0B = C0.b();
                            C2013v0.f26276b = c2013v0B;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c2013v0 = c2013v0B;
            }
            cVar.c(H1.q(byteArray, c2013v0), j, z10);
        } catch (Throwable unused) {
            int i11 = C2018x.f26297a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0206 A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:90:0x01d0, B:92:0x0206, B:94:0x0225, B:93:0x020b), top: B:100:0x01d0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x020b A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:90:0x01d0, B:92:0x0206, B:94:0x0225, B:93:0x020b), top: B:100:0x01d0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x022f  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b10;
        zzil zzilVar;
        a aVarE;
        ArrayList arrayList;
        c cVar;
        V1 v10;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        zzil zzilVar2 = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        zzil zzilVar3 = zzil.PURCHASES_UPDATED_ACTION;
        zzil zzilVar4 = zzil.ALTERNATIVE_BILLING_ACTION;
        if (b10 == 0) {
            zzilVar = zzilVar3;
        } else if (b10 != 1) {
            zzilVar = b10 != 2 ? zzil.BROADCAST_ACTION_UNSPECIFIED : zzilVar4;
        } else {
            zzilVar = zzilVar2;
        }
        int i10 = (zzilVar.equals(zzilVar2) || zzilVar.equals(zzilVar4)) ? 2 : zzilVar.equals(zzilVar3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        H h8 = this.f47141c;
        if (extras == null) {
            int i11 = C2018x.f26297a;
            Log.isLoggable("BillingBroadcastManager", 5);
            c cVar2 = h8.f47144c;
            zzie zzieVar = zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            a aVar = b.f23563f;
            cVar2.a(C.b(zzieVar, i10, aVar, null, zzilVar));
            InterfaceC2794g interfaceC2794g = h8.f47143b;
            if (interfaceC2794g != null) {
                interfaceC2794g.a(aVar, null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i12 = C2018x.f26297a;
            a.C0244a c0244aA = a.a();
            c0244aA.f23555a = C2018x.a(intent.getExtras(), "BillingBroadcastManager");
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                Log.isLoggable("BillingBroadcastManager", 5);
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    C2018x.h("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName());
                        Log.isLoggable("BillingBroadcastManager", 5);
                    }
                    c0244aA.f23556b = iIntValue;
                    c0244aA.f23557c = C2018x.f(intent.getExtras(), "BillingBroadcastManager");
                    aVarE = c0244aA.a();
                }
            }
            iIntValue = 0;
            c0244aA.f23556b = iIntValue;
            c0244aA.f23557c = C2018x.f(intent.getExtras(), "BillingBroadcastManager");
            aVarE = c0244aA.a();
        } else {
            aVarE = C2018x.e(intent, "BillingBroadcastManager");
        }
        long j = extras.getLong("billingClientTransactionId", 0L);
        boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!zzilVar.equals(zzilVar3) && !zzilVar.equals(zzilVar2)) {
            if (zzilVar.equals(zzilVar4)) {
                if (aVarE.f23552a != 0) {
                    c(extras, aVarE, i10, zzilVar, j, z10);
                    h8.f47143b.a(aVarE, zzbt.G());
                    return;
                }
                h8.getClass();
                Log.isLoggable("BillingBroadcastManager", 5);
                zzie zzieVar2 = zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                a aVar2 = b.f23563f;
                h8.f47144c.c(C.b(zzieVar2, i10, aVar2, null, zzilVar), j, z10);
                h8.f47143b.a(aVar2, zzbt.G());
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseJ = C2018x.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseJ == null) {
                C2018x.h("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList2.add(purchaseJ);
            }
            if (aVarE.f23552a == 0) {
                cVar = h8.f47144c;
                K1 k1C = C.c(i10, zzilVar);
                cVar.getClass();
                try {
                    J1 j10 = (J1) k1C.i();
                    c2 c2Var = (c2) k1C.q().i();
                    c2Var.f();
                    g2.q((g2) c2Var.f26124c, z10);
                    j10.f();
                    K1.s((K1) j10.f26124c, (g2) c2Var.c());
                    K1 k10 = (K1) j10.c();
                    if (j == 0) {
                        v10 = (V1) cVar.f5123b;
                    } else {
                        U1 u10 = (U1) ((V1) cVar.f5123b).i();
                        u10.f();
                        V1.u((V1) u10.f26124c, j);
                        v10 = (V1) u10.c();
                    }
                    cVar.g(k10, v10);
                } catch (Throwable unused) {
                    C2018x.i("BillingLogger");
                }
            } else {
                c(extras, aVarE, i10, zzilVar, j, z10);
            }
            h8.f47143b.a(aVarE, arrayList);
        }
        C2018x.h("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i13 = 0; i13 < stringArrayList.size() && i13 < stringArrayList2.size(); i13++) {
            Purchase purchaseJ2 = C2018x.j(stringArrayList.get(i13), stringArrayList2.get(i13));
            if (purchaseJ2 != null) {
                arrayList2.add(purchaseJ2);
            }
        }
        arrayList = arrayList2;
        if (aVarE.f23552a == 0) {
            cVar = h8.f47144c;
            K1 k1C2 = C.c(i10, zzilVar);
            cVar.getClass();
            J1 j11 = (J1) k1C2.i();
            c2 c2Var2 = (c2) k1C2.q().i();
            c2Var2.f();
            g2.q((g2) c2Var2.f26124c, z10);
            j11.f();
            K1.s((K1) j11.f26124c, (g2) c2Var2.c());
            K1 k11 = (K1) j11.c();
            if (j == 0) {
                v10 = (V1) cVar.f5123b;
            } else {
                U1 u11 = (U1) ((V1) cVar.f5123b).i();
                u11.f();
                V1.u((V1) u11.f26124c, j);
                v10 = (V1) u11.c();
            }
            cVar.g(k11, v10);
        } else {
            c(extras, aVarE, i10, zzilVar, j, z10);
        }
        h8.f47143b.a(aVarE, arrayList);
    }
}
