package com.voltasit.obdeleven.domain.usecases.device;

import A1.J;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.Q;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: SetIsoTpExtendedTransferIdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements J, p235t1.r {
    public static final ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.google.android.play.integrity.internal.p pVar = (com.google.android.play.integrity.internal.p) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", pVar.a());
            bundle.putLong("event_timestamp", pVar.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final int f(LookaheadCapablePlaceable lookaheadCapablePlaceable, AbstractC1155a abstractC1155a) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableY0 = lookaheadCapablePlaceable.y0();
        if (lookaheadCapablePlaceableY0 == null) {
            R.a.b("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.F0().o().containsKey(abstractC1155a)) {
            Integer num = lookaheadCapablePlaceable.F0().o().get(abstractC1155a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iV = lookaheadCapablePlaceableY0.V(abstractC1155a);
        if (iV == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        lookaheadCapablePlaceableY0.f14439h = true;
        lookaheadCapablePlaceable.f14440i = true;
        lookaheadCapablePlaceable.V0();
        lookaheadCapablePlaceableY0.f14439h = false;
        lookaheadCapablePlaceable.f14440i = false;
        return iV + ((int) (abstractC1155a instanceof C1165k ? lookaheadCapablePlaceableY0.H0() & 4294967295L : lookaheadCapablePlaceableY0.H0() >> 32));
    }

    public static final void g(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(J4.i.b(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static void h(String str, Throwable th) {
        Log.e("android-crop", str, th);
    }

    public static final int i(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final Ya.b j(Object obj, Ya.b... bVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = Ya.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (objInvoke instanceof Ya.b) {
                return (Ya.b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static boolean k(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // p235t1.r
    public boolean b() {
        return true;
    }

    @Override // p235t1.r
    public int c(long j) {
        return 0;
    }

    @Override // p235t1.r
    public int d(Q q10, DecoderInputBuffer decoderInputBuffer, int i10) {
        decoderInputBuffer.f6597b = 4;
        return -4;
    }

    @Override // p235t1.r
    public void a() {
    }
}
