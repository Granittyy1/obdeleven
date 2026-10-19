package com.voltasit.obdeleven.domain.usecases;

import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.NegativeResponseCodeException;
import com.voltasit.obdeleven.domain.exceptions.ProtocolNotConnectedException;
import com.voltasit.obdeleven.domain.exceptions.UnknownProtocolException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BluetoothRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2112a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p084g8.c f30634a;

    public C2112a(p084g8.c cVar) {
        this.f30634a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Protocol protocol, String str, String str2, int i10, ContinuationImpl continuationImpl) {
        BluetoothRequestUC$checkIfRepeat$1 bluetoothRequestUC$checkIfRepeat$1;
        C2112a c2112a;
        if (continuationImpl instanceof BluetoothRequestUC$checkIfRepeat$1) {
            bluetoothRequestUC$checkIfRepeat$1 = (BluetoothRequestUC$checkIfRepeat$1) continuationImpl;
            int i11 = bluetoothRequestUC$checkIfRepeat$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bluetoothRequestUC$checkIfRepeat$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bluetoothRequestUC$checkIfRepeat$1 = new BluetoothRequestUC$checkIfRepeat$1(this, continuationImpl);
            }
        } else {
            bluetoothRequestUC$checkIfRepeat$1 = new BluetoothRequestUC$checkIfRepeat$1(this, continuationImpl);
        }
        Object objC = bluetoothRequestUC$checkIfRepeat$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = bluetoothRequestUC$checkIfRepeat$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = bluetoothRequestUC$checkIfRepeat$1.I$0;
                str = (String) bluetoothRequestUC$checkIfRepeat$1.L$2;
                protocol = (Protocol) bluetoothRequestUC$checkIfRepeat$1.L$1;
                c2112a = (C2112a) bluetoothRequestUC$checkIfRepeat$1.L$0;
                kotlin.b.b(objC);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objC);
            }
            return (C8.a) objC;
        }
        kotlin.b.b(objC);
        String strSubstring = str2.substring(0, 2);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        O.h.c(16);
        if (Integer.parseInt(strSubstring, 16) != 127) {
            return new C8.a.b(str2);
        }
        String strSubstring2 = str2.substring(4, 6);
        kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
        O.h.c(16);
        int i13 = Integer.parseInt(strSubstring2, 16);
        if ((i13 != 33 && i13 != 35) || i10 >= 3) {
            String strSubstring3 = str2.substring(4);
            kotlin.jvm.internal.i.d(strSubstring3, "substring(...)");
            O.h.c(16);
            return new C8.a.C0024a(new NegativeResponseCodeException(Integer.parseInt(strSubstring3, 16)));
        }
        bluetoothRequestUC$checkIfRepeat$1.L$0 = this;
        bluetoothRequestUC$checkIfRepeat$1.L$1 = protocol;
        bluetoothRequestUC$checkIfRepeat$1.L$2 = str;
        bluetoothRequestUC$checkIfRepeat$1.I$0 = i10;
        bluetoothRequestUC$checkIfRepeat$1.label = 1;
        if (I.b(1000L, bluetoothRequestUC$checkIfRepeat$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        c2112a = this;
        bluetoothRequestUC$checkIfRepeat$1.L$0 = null;
        bluetoothRequestUC$checkIfRepeat$1.L$1 = null;
        bluetoothRequestUC$checkIfRepeat$1.L$2 = null;
        bluetoothRequestUC$checkIfRepeat$1.label = 2;
        objC = c2112a.c(protocol, str, i10 + 1, bluetoothRequestUC$checkIfRepeat$1);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        return (C8.a) objC;
    }

    public final Object b(String str, ContinuationImpl continuationImpl, short s10) {
        try {
            Protocol protocolC = this.f30634a.c(s10);
            return !protocolC.d() ? new C8.a.C0024a(new ProtocolNotConnectedException()) : c(protocolC, str, 0, continuationImpl);
        } catch (Exception e10) {
            return new C8.a.C0024a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(Protocol protocol, String str, int i10, ContinuationImpl continuationImpl) {
        BluetoothRequestUC$request$1 bluetoothRequestUC$request$1;
        C2112a c2112a;
        int i11;
        String str2;
        Protocol protocol2;
        Task<String> task;
        if (continuationImpl instanceof BluetoothRequestUC$request$1) {
            bluetoothRequestUC$request$1 = (BluetoothRequestUC$request$1) continuationImpl;
            int i12 = bluetoothRequestUC$request$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bluetoothRequestUC$request$1.label = i12 - Integer.MIN_VALUE;
            } else {
                bluetoothRequestUC$request$1 = new BluetoothRequestUC$request$1(this, continuationImpl);
            }
        } else {
            bluetoothRequestUC$request$1 = new BluetoothRequestUC$request$1(this, continuationImpl);
        }
        BluetoothRequestUC$request$1 bluetoothRequestUC$request$2 = bluetoothRequestUC$request$1;
        Object objA = bluetoothRequestUC$request$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = bluetoothRequestUC$request$2.label;
        if (i13 == 0) {
            kotlin.b.b(objA);
            Task<String> taskG = protocol.g(str);
            Sa.a aVar = N.f43200c;
            BluetoothRequestUC$request$2 bluetoothRequestUC$request$3 = new BluetoothRequestUC$request$2(taskG, null);
            bluetoothRequestUC$request$2.L$0 = this;
            bluetoothRequestUC$request$2.L$1 = protocol;
            bluetoothRequestUC$request$2.L$2 = str;
            bluetoothRequestUC$request$2.L$3 = taskG;
            bluetoothRequestUC$request$2.I$0 = i10;
            bluetoothRequestUC$request$2.label = 1;
            if (C2680e.f(aVar, bluetoothRequestUC$request$3, bluetoothRequestUC$request$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2112a = this;
            i11 = i10;
            str2 = str;
            protocol2 = protocol;
            task = taskG;
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    kotlin.b.b(objA);
                }
                if (i13 == 3) {
                    kotlin.b.b(objA);
                }
                if (i13 == 4) {
                    kotlin.b.b(objA);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = bluetoothRequestUC$request$2.I$0;
            task = (Task) bluetoothRequestUC$request$2.L$3;
            String str3 = (String) bluetoothRequestUC$request$2.L$2;
            Protocol protocol3 = (Protocol) bluetoothRequestUC$request$2.L$1;
            C2112a c2112a2 = (C2112a) bluetoothRequestUC$request$2.L$0;
            kotlin.b.b(objA);
            str2 = str3;
            protocol2 = protocol3;
            c2112a = c2112a2;
            i11 = i14;
        }
        if (task.isFaulted()) {
            Exception error = task.getError();
            kotlin.jvm.internal.i.d(error, "getError(...)");
            return new C8.a.C0024a(error);
        }
        if (protocol2 instanceof Kwp2000Protocol) {
            String result = task.getResult();
            kotlin.jvm.internal.i.d(result, "getResult(...)");
            bluetoothRequestUC$request$2.L$0 = null;
            bluetoothRequestUC$request$2.L$1 = null;
            bluetoothRequestUC$request$2.L$2 = null;
            bluetoothRequestUC$request$2.L$3 = null;
            bluetoothRequestUC$request$2.label = 2;
            objA = c2112a.a(protocol2, str2, result, i11, bluetoothRequestUC$request$2);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        }
        if (protocol2 instanceof com.obdeleven.service.protocol.c) {
            String result2 = task.getResult();
            kotlin.jvm.internal.i.d(result2, "getResult(...)");
            bluetoothRequestUC$request$2.L$0 = null;
            bluetoothRequestUC$request$2.L$1 = null;
            bluetoothRequestUC$request$2.L$2 = null;
            bluetoothRequestUC$request$2.L$3 = null;
            bluetoothRequestUC$request$2.label = 3;
            objA = c2112a.a(protocol2, str2, result2, i11, bluetoothRequestUC$request$2);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        }
        if (!(protocol2 instanceof com.obdeleven.service.protocol.f)) {
            return protocol2 instanceof com.obdeleven.service.protocol.b ? new C8.a.b(task.getResult()) : new C8.a.C0024a(new UnknownProtocolException());
        }
        String result3 = task.getResult();
        kotlin.jvm.internal.i.d(result3, "getResult(...)");
        bluetoothRequestUC$request$2.L$0 = null;
        bluetoothRequestUC$request$2.L$1 = null;
        bluetoothRequestUC$request$2.L$2 = null;
        bluetoothRequestUC$request$2.L$3 = null;
        bluetoothRequestUC$request$2.label = 4;
        objA = c2112a.a(protocol2, str2, result3, i11, bluetoothRequestUC$request$2);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
