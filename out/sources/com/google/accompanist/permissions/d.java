package com.google.accompanist.permissions;

import Ia.l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: PermissionState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final a a(InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.e(923020361);
        final PermissionStateKt$rememberPermissionState$1 permissionStateKt$rememberPermissionState$1 = new l<Boolean, r>() { // from class: com.google.accompanist.permissions.PermissionStateKt$rememberPermissionState$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                bool.booleanValue();
                return r.f47939a;
            }
        };
        interfaceC1084f.e(1424240517);
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        interfaceC1084f.e(-1903070007);
        boolean zK = interfaceC1084f.K("android.permission.RECORD_AUDIO");
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (zK || objF == obj) {
            i.e(context, "<this>");
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    throw new IllegalStateException("Permissions should be called in the context of an Activity");
                }
                if (baseContext instanceof Activity) {
                    objF = new a(context, (Activity) baseContext);
                    interfaceC1084f.E(objF);
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                i.d(baseContext, "getBaseContext(...)");
            }
        }
        final a aVar = (a) objF;
        interfaceC1084f.I();
        PermissionsUtilKt.a(aVar, null, interfaceC1084f, 0, 2);
        p076g.c cVar = new p076g.c();
        interfaceC1084f.e(-1903069605);
        boolean zK2 = interfaceC1084f.K(aVar) | interfaceC1084f.k(permissionStateKt$rememberPermissionState$1);
        Object objF2 = interfaceC1084f.f();
        if (zK2 || objF2 == obj) {
            objF2 = new l<Boolean, r>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.getClass();
                    a aVar2 = aVar;
                    aVar2.f25215c.setValue(aVar2.a());
                    permissionStateKt$rememberPermissionState$1.invoke(bool2);
                    return r.f47939a;
                }
            };
            interfaceC1084f.E(objF2);
        }
        interfaceC1084f.I();
        final androidx.activity.compose.e eVarA = ActivityResultRegistryKt.a(cVar, (l) objF2, interfaceC1084f, 8);
        E.b(aVar, eVarA, new l<B, A>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final A invoke(B b10) {
                B DisposableEffect = b10;
                i.e(DisposableEffect, "$this$DisposableEffect");
                aVar.getClass();
                return new b(aVar);
            }
        }, interfaceC1084f);
        interfaceC1084f.I();
        interfaceC1084f.I();
        return aVar;
    }
}
