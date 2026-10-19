package com.voltasit.obdeleven.data.repositories;

import com.voltasit.obdeleven.domain.models.UserPermission;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p304y9.J;

/* JADX INFO: compiled from: PermissionRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements K8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.y f30376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.c f30377c;

    public o(com.voltasit.sharednetwork.a aVar, A8.y yVar, F8.c cVar) {
        this.f30375a = aVar;
        this.f30376b = yVar;
        this.f30377c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.m
    public final Object a(ContinuationImpl continuationImpl) {
        PermissionRepositoryImpl$getPermissions$1 permissionRepositoryImpl$getPermissions$1;
        o oVar;
        UserPermission userPermission;
        if (continuationImpl instanceof PermissionRepositoryImpl$getPermissions$1) {
            permissionRepositoryImpl$getPermissions$1 = (PermissionRepositoryImpl$getPermissions$1) continuationImpl;
            int i10 = permissionRepositoryImpl$getPermissions$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                permissionRepositoryImpl$getPermissions$1.label = i10 - Integer.MIN_VALUE;
            } else {
                permissionRepositoryImpl$getPermissions$1 = new PermissionRepositoryImpl$getPermissions$1(this, continuationImpl);
            }
        } else {
            permissionRepositoryImpl$getPermissions$1 = new PermissionRepositoryImpl$getPermissions$1(this, continuationImpl);
        }
        Object objR = permissionRepositoryImpl$getPermissions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = permissionRepositoryImpl$getPermissions$1.label;
        if (i11 == 0) {
            kotlin.b.b(objR);
            try {
                com.voltasit.sharednetwork.a aVar = this.f30375a;
                permissionRepositoryImpl$getPermissions$1.L$0 = this;
                permissionRepositoryImpl$getPermissions$1.label = 1;
                objR = aVar.r(permissionRepositoryImpl$getPermissions$1);
                if (objR == coroutineSingletons) {
                    return coroutineSingletons;
                }
                oVar = this;
            } catch (Throwable th) {
                th = th;
                oVar = this;
                return new C8.a.C0024a(oVar.f30377c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (o) permissionRepositoryImpl$getPermissions$1.L$0;
            try {
                kotlin.b.b(objR);
            } catch (Throwable th2) {
                th = th2;
                return new C8.a.C0024a(oVar.f30377c.a(th));
            }
        }
        List<J> list = (List) objR;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (J input : list) {
            A8.y yVar = oVar.f30376b;
            kotlin.jvm.internal.i.e(input, "input");
            UserPermission.f30545b.getClass();
            UserPermission[] userPermissionArr = UserPermission.f30546c;
            int length = userPermissionArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    userPermission = null;
                    break;
                }
                userPermission = userPermissionArr[i12];
                if (userPermission.a() == input.f48521a) {
                    break;
                }
                i12++;
            }
            if (userPermission == null) {
                userPermission = UserPermission.UNKNOWN_PERMISSION;
            }
            arrayList.add(userPermission);
        }
        return new C8.a.b(arrayList);
    }
}
