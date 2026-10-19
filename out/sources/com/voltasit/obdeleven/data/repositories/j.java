package com.voltasit.obdeleven.data.repositories;

import com.obdeleven.service.model.IntelHexRecord;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.C2804g;

/* JADX INFO: compiled from: FirmwareRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements K8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F8.c f30355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30356b;

    public j(F8.c cVar, J8.p pVar) {
        this.f30355a = cVar;
        this.f30356b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.h
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FirmwareRepositoryImpl$getFirmware$1 firmwareRepositoryImpl$getFirmware$1;
        j jVar;
        Object objA;
        if (continuationImpl instanceof FirmwareRepositoryImpl$getFirmware$1) {
            firmwareRepositoryImpl$getFirmware$1 = (FirmwareRepositoryImpl$getFirmware$1) continuationImpl;
            int i10 = firmwareRepositoryImpl$getFirmware$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                firmwareRepositoryImpl$getFirmware$1.label = i10 - Integer.MIN_VALUE;
            } else {
                firmwareRepositoryImpl$getFirmware$1 = new FirmwareRepositoryImpl$getFirmware$1(this, continuationImpl);
            }
        } else {
            firmwareRepositoryImpl$getFirmware$1 = new FirmwareRepositoryImpl$getFirmware$1(this, continuationImpl);
        }
        Object objB = firmwareRepositoryImpl$getFirmware$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = firmwareRepositoryImpl$getFirmware$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            int i12 = C2804g.f47471b;
            ParseQuery query = ParseQuery.getQuery(C2804g.class);
            query.whereEqualTo("objectId", str);
            try {
                Task firstInBackground = query.getFirstInBackground();
                kotlin.jvm.internal.i.d(firstInBackground, "getFirstInBackground(...)");
                firmwareRepositoryImpl$getFirmware$1.L$0 = this;
                firmwareRepositoryImpl$getFirmware$1.label = 1;
                objB = ParseTaskExtensionsKt.b(firstInBackground, firmwareRepositoryImpl$getFirmware$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jVar = this;
            } catch (Throwable th) {
                th = th;
                jVar = this;
                objA = kotlin.b.a(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) firmwareRepositoryImpl$getFirmware$1.L$0;
            try {
                kotlin.b.b(objB);
            } catch (Throwable th2) {
                th = th2;
                objA = kotlin.b.a(th);
            }
        }
        objA = (C2804g) objB;
        Throwable thA = Result.a(objA);
        return thA != null ? kotlin.b.a(jVar.f30355a.a(thA)) : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.h
    public final Serializable b(C2804g c2804g, ContinuationImpl continuationImpl) {
        FirmwareRepositoryImpl$getHexList$1 firmwareRepositoryImpl$getHexList$1;
        j jVar;
        Object objA;
        if (continuationImpl instanceof FirmwareRepositoryImpl$getHexList$1) {
            firmwareRepositoryImpl$getHexList$1 = (FirmwareRepositoryImpl$getHexList$1) continuationImpl;
            int i10 = firmwareRepositoryImpl$getHexList$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                firmwareRepositoryImpl$getHexList$1.label = i10 - Integer.MIN_VALUE;
            } else {
                firmwareRepositoryImpl$getHexList$1 = new FirmwareRepositoryImpl$getHexList$1(this, continuationImpl);
            }
        } else {
            firmwareRepositoryImpl$getHexList$1 = new FirmwareRepositoryImpl$getHexList$1(this, continuationImpl);
        }
        Object objB = firmwareRepositoryImpl$getHexList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = firmwareRepositoryImpl$getHexList$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            Task<File> fileInBackground = c2804g.getParseFile("fwHex").getFileInBackground();
            try {
                kotlin.jvm.internal.i.b(fileInBackground);
                firmwareRepositoryImpl$getHexList$1.L$0 = this;
                firmwareRepositoryImpl$getHexList$1.label = 1;
                objB = ParseTaskExtensionsKt.b(fileInBackground, firmwareRepositoryImpl$getHexList$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jVar = this;
            } catch (Throwable th) {
                th = th;
                jVar = this;
                objA = kotlin.b.a(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) firmwareRepositoryImpl$getHexList$1.L$0;
            try {
                kotlin.b.b(objB);
            } catch (Throwable th2) {
                th = th2;
                objA = kotlin.b.a(th);
            }
        }
        objA = (File) objB;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            return kotlin.b.a(jVar.f30355a.a(thA));
        }
        File file = (File) objA;
        kotlin.jvm.internal.i.b(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i12 = (int) length;
            byte[] bArrCopyOf = new byte[i12];
            int i13 = i12;
            int i14 = 0;
            while (i13 > 0) {
                int i15 = fileInputStream.read(bArrCopyOf, i14, i13);
                if (i15 < 0) {
                    break;
                }
                i13 -= i15;
                i14 += i15;
            }
            if (i13 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i16 = fileInputStream.read();
                if (i16 != -1) {
                    Fa.a aVar = new Fa.a(8193);
                    aVar.write(i16);
                    com.voltasit.obdeleven.domain.usecases.device.v.b(fileInputStream, aVar);
                    int size = aVar.size() + i12;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = aVar.b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(...)");
                    Q3.d.l(i12, 0, aVar.size(), bArrB, bArrCopyOf);
                }
            }
            p241t7.b.n(fileInputStream, null);
            jVar.getClass();
            String str = new String(bArrCopyOf, kotlin.text.a.f43120b);
            ArrayList arrayList = new ArrayList();
            try {
                for (String str2 : kotlin.text.n.e0(str, new String[]{"\r\n"}, 0, 6)) {
                    if (str2.length() > 0) {
                        arrayList.add(new IntelHexRecord(str2));
                    }
                }
            } catch (Throwable th3) {
                jVar.f30356b.d(th3, false);
            }
            return arrayList;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                p241t7.b.n(fileInputStream, th4);
                throw th5;
            }
        }
    }
}
