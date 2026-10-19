package com.voltasit.obdeleven.ui.dialogs.user;

import Aa.c;
import Ia.p;
import com.voltasit.obdeleven.domain.usecases.user.C2121b;
import com.voltasit.obdeleven.domain.usecases.user.E;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.v;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ForceChangePasswordViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordViewModel$changePassword$1", f = "ForceChangePasswordViewModel.kt", l = {R.styleable.AppCompatTheme_actionOverflowButtonStyle, R.styleable.AppCompatTheme_alertDialogCenterButtons, R.styleable.AppCompatTheme_alertDialogStyle, R.styleable.AppCompatTheme_autoCompleteTextViewStyle, R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle, 44}, m = "invokeSuspend")
final class ForceChangePasswordViewModel$changePassword$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordViewModel$changePassword$1(b bVar, String str, kotlin.coroutines.c<? super ForceChangePasswordViewModel$changePassword$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$password = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ForceChangePasswordViewModel$changePassword$1(this.this$0, this.$password, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ForceChangePasswordViewModel$changePassword$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a aVar;
        v vVar;
        r rVar;
        v vVar2;
        Boolean bool;
        v vVar3;
        r rVar2;
        v vVar4;
        Boolean bool2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                E e10 = this.this$0.f34037a;
                String str = this.$password;
                e10.getClass();
                if (E.a(str) instanceof C8.a.C0024a) {
                    v vVar5 = this.this$0.f34042f;
                    r rVar3 = r.f47939a;
                    this.label = 1;
                    if (vVar5.emit(rVar3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return r.f47939a;
                }
                v vVar6 = this.this$0.f34040d;
                Boolean bool3 = Boolean.TRUE;
                this.label = 2;
                if (vVar6.emit(bool3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                C2121b c2121b = this.this$0.f34038b;
                String str2 = this.$password;
                this.label = 3;
                obj = c2121b.a(str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = (C8.a) obj;
                if (aVar instanceof C8.a.b) {
                    vVar2 = this.this$0.f34040d;
                    bool = Boolean.FALSE;
                    this.label = 4;
                    if (vVar2.emit(bool, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = this.this$0.f34044h;
                    rVar2 = r.f47939a;
                    this.label = 5;
                    if (vVar3.emit(rVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (aVar instanceof C8.a.C0024a) {
                    vVar = this.this$0.j;
                    rVar = r.f47939a;
                    this.label = 6;
                    if (vVar.emit(rVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar4 = this.this$0.f34040d;
                    bool2 = Boolean.FALSE;
                    this.label = 7;
                    if (vVar4.emit(bool2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return r.f47939a;
            case 1:
                kotlin.b.b(obj);
                return r.f47939a;
            case 2:
                kotlin.b.b(obj);
                C2121b c2121b2 = this.this$0.f34038b;
                String str3 = this.$password;
                this.label = 3;
                obj = c2121b2.a(str3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = (C8.a) obj;
                if (aVar instanceof C8.a.b) {
                    vVar2 = this.this$0.f34040d;
                    bool = Boolean.FALSE;
                    this.label = 4;
                    if (vVar2.emit(bool, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = this.this$0.f34044h;
                    rVar2 = r.f47939a;
                    this.label = 5;
                    if (vVar3.emit(rVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (aVar instanceof C8.a.C0024a) {
                    vVar = this.this$0.j;
                    rVar = r.f47939a;
                    this.label = 6;
                    if (vVar.emit(rVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar4 = this.this$0.f34040d;
                    bool2 = Boolean.FALSE;
                    this.label = 7;
                    if (vVar4.emit(bool2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return r.f47939a;
            case 3:
                kotlin.b.b(obj);
                aVar = (C8.a) obj;
                if (aVar instanceof C8.a.b) {
                    vVar2 = this.this$0.f34040d;
                    bool = Boolean.FALSE;
                    this.label = 4;
                    if (vVar2.emit(bool, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = this.this$0.f34044h;
                    rVar2 = r.f47939a;
                    this.label = 5;
                    if (vVar3.emit(rVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (aVar instanceof C8.a.C0024a) {
                    vVar = this.this$0.j;
                    rVar = r.f47939a;
                    this.label = 6;
                    if (vVar.emit(rVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar4 = this.this$0.f34040d;
                    bool2 = Boolean.FALSE;
                    this.label = 7;
                    if (vVar4.emit(bool2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return r.f47939a;
            case 4:
                kotlin.b.b(obj);
                vVar3 = this.this$0.f34044h;
                rVar2 = r.f47939a;
                this.label = 5;
                if (vVar3.emit(rVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 5:
            case 7:
                kotlin.b.b(obj);
                return r.f47939a;
            case 6:
                kotlin.b.b(obj);
                vVar4 = this.this$0.f34040d;
                bool2 = Boolean.FALSE;
                this.label = 7;
                if (vVar4.emit(bool2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
