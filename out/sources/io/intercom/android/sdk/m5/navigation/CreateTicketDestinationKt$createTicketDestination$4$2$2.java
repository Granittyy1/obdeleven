package io.intercom.android.sdk.m5.navigation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: compiled from: CreateTicketDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketDestinationKt$createTicketDestination$4$2$2 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ androidx.compose.runtime.X<AnswerClickData> $answerClickedData;
    final /* synthetic */ AnswerClickData $data;
    final /* synthetic */ kotlinx.coroutines.A $scope;
    final /* synthetic */ CreateTicketViewModel $viewModel;

    public CreateTicketDestinationKt$createTicketDestination$4$2$2(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, kotlinx.coroutines.A a10, androidx.compose.runtime.X<AnswerClickData> x10) {
        this.$data = answerClickData;
        this.$viewModel = createTicketViewModel;
        this.$scope = a10;
        this.$answerClickedData = x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$4$lambda$0(CreateTicketViewModel viewModel, AnswerClickData data, kotlinx.coroutines.A scope, androidx.compose.runtime.X answerClickedData) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(data, "$data");
        kotlin.jvm.internal.i.e(scope, "$scope");
        kotlin.jvm.internal.i.e(answerClickedData, "$answerClickedData");
        viewModel.onRetryFileClicked(data);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$4$lambda$1(CreateTicketViewModel viewModel, AnswerClickData data, kotlinx.coroutines.A scope, androidx.compose.runtime.X answerClickedData) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(data, "$data");
        kotlin.jvm.internal.i.e(scope, "$scope");
        kotlin.jvm.internal.i.e(answerClickedData, "$answerClickedData");
        viewModel.onDeleteFileClicked(data);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$4$lambda$2(CreateTicketViewModel viewModel, AnswerClickData data, kotlinx.coroutines.A scope, androidx.compose.runtime.X answerClickedData) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(data, "$data");
        kotlin.jvm.internal.i.e(scope, "$scope");
        kotlin.jvm.internal.i.e(answerClickedData, "$answerClickedData");
        viewModel.onDeleteFileClicked(data);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$4$lambda$3(kotlinx.coroutines.A scope, androidx.compose.runtime.X answerClickedData) {
        kotlin.jvm.internal.i.e(scope, "$scope");
        kotlin.jvm.internal.i.e(answerClickedData, "$answerClickedData");
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(scope, answerClickedData);
        return p293xa.r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0954n, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC0954n ModalBottomSheet, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        androidx.compose.ui.h hVarA = ComposedModifierKt.a(androidx.compose.ui.h.a.f13984b, InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1());
        final AnswerClickData answerClickData = this.$data;
        final CreateTicketViewModel createTicketViewModel = this.$viewModel;
        final kotlinx.coroutines.A a10 = this.$scope;
        final androidx.compose.runtime.X<AnswerClickData> x10 = this.$answerClickedData;
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int iF = interfaceC1084f.F();
        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarA);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        if (interfaceC1084f.u() == null) {
            I.b.k();
            throw null;
        }
        interfaceC1084f.r();
        if (interfaceC1084f.m()) {
            interfaceC1084f.v(aVar);
        } else {
            interfaceC1084f.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, eD);
        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
            androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
        FileActionSheetKt.FileActionSheet(answerClickData.getClickedItem(), new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.p
            @Override // Ia.a
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$0(createTicketViewModel, answerClickData, a10, x10);
            }
        }, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.q
            @Override // Ia.a
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$1(createTicketViewModel, answerClickData, a10, x10);
            }
        }, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.r
            @Override // Ia.a
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$2(createTicketViewModel, answerClickData, a10, x10);
            }
        }, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.s
            @Override // Ia.a
            public final Object invoke() {
                return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$3(a10, x10);
            }
        }, interfaceC1084f, 0);
        interfaceC1084f.J();
    }
}
