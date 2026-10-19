package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.compose.D;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2279f0;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: UploadFileQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadFileQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2, reason: invalid class name */
    /* JADX INFO: compiled from: UploadFileQuestion.kt */
    public static final class AnonymousClass2 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ Context $context;
        final /* synthetic */ androidx.compose.ui.h $modifier;
        final /* synthetic */ Ia.l<Answer, p293xa.r> $onAnswer;
        final /* synthetic */ Ia.l<AnswerClickData, p293xa.r> $onAnswerClick;
        final /* synthetic */ Ia.p<InterfaceC1084f, Integer, p293xa.r> $questionHeader;
        final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel $questionModel;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Answer answer, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Ia.l<? super AnswerClickData, p293xa.r> lVar, Ia.l<? super Answer, p293xa.r> lVar2, Context context) {
            this.$modifier = hVar;
            this.$questionHeader = pVar;
            this.$answer = answer;
            this.$questionModel = uploadFileQuestionModel;
            this.$onAnswerClick = lVar;
            this.$onAnswer = lVar2;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5$lambda$0(Ia.l lVar, SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer.MediaAnswer.MediaItem item) {
            kotlin.jvm.internal.i.e(questionModel, "$questionModel");
            kotlin.jvm.internal.i.e(item, "item");
            lVar.invoke(new AnswerClickData(item, questionModel.getId()));
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5$lambda$4(Answer answer, Ia.l onAnswer, Context context, List uris) {
            kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
            kotlin.jvm.internal.i.e(context, "$context");
            kotlin.jvm.internal.i.e(uris, "uris");
            ArrayList arrayList = new ArrayList();
            Iterator it = uris.iterator();
            while (it.hasNext()) {
                MediaData.Media mediaData$default = URIExtensionsKt.getMediaData$default((Uri) it.next(), context, false, 2, null);
                if (mediaData$default != null) {
                    arrayList.add(mediaData$default);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Answer.MediaAnswer.MediaItem((MediaData.Media) it2.next()));
            }
            if (answer instanceof Answer.NoAnswer.InitialNoAnswer) {
                onAnswer.invoke(new Answer.MediaAnswer(arrayList2));
            } else {
                ArrayList arrayList3 = new ArrayList();
                kotlin.jvm.internal.i.c(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                arrayList3.addAll(((Answer.MediaAnswer) answer).getMediaItems());
                arrayList3.addAll(arrayList2);
                onAnswer.invoke(new Answer.MediaAnswer(arrayList3));
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVar = this.$modifier;
            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar = this.$questionHeader;
            final Answer answer = this.$answer;
            final SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = this.$questionModel;
            final Ia.l<AnswerClickData, p293xa.r> lVar = this.$onAnswerClick;
            final Ia.l<Answer, p293xa.r> lVar2 = this.$onAnswer;
            final Context context = this.$context;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVar);
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
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            pVar.invoke(interfaceC1084f, 0);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            float f10 = 8;
            Lb.a.a(interfaceC1084f, W.e(aVar2, f10));
            interfaceC1084f.L(903574919);
            boolean z10 = answer instanceof Answer.MediaAnswer;
            if (z10) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                FileAttachmentListKt.FileAttachmentList(mediaAnswer.getMediaItems(), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.x
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return UploadFileQuestionKt.AnonymousClass2.invoke$lambda$5$lambda$0(lVar, uploadFileQuestionModel, (Answer.MediaAnswer.MediaItem) obj);
                    }
                }, interfaceC1084f, 8);
                if (!mediaAnswer.getMediaItems().isEmpty()) {
                    Lb.a.a(interfaceC1084f, W.e(aVar2, f10));
                }
            }
            interfaceC1084f.D();
            int size = z10 ? ((Answer.MediaAnswer) answer).getMediaItems().size() : 0;
            interfaceC1084f.L(903602132);
            if (size < uploadFileQuestionModel.getMaxSelection()) {
                MediaPickerButtonKt.MediaPickerButton(uploadFileQuestionModel.getMaxSelection() - size, null, MediaType.All, uploadFileQuestionModel.getSupportedFileType(), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.y
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return UploadFileQuestionKt.AnonymousClass2.invoke$lambda$5$lambda$4(answer, lVar2, context, (List) obj);
                    }
                }, new MediaPickerButtonCTAStyle.TextButton(S4.o.p(interfaceC1084f, R.string.intercom_add)), null, androidx.compose.runtime.internal.a.b(562613810, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2$1$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                        if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            AddFileButtonKt.AddFileButton(null, uploadFileQuestionModel.getMaxSelection() == 1 ? R.string.intercom_tickets_add_file : R.string.intercom_tickets_add_files, interfaceC1084f2, 0, 1);
                        }
                    }
                }, interfaceC1084f), interfaceC1084f, (MediaPickerButtonCTAStyle.TextButton.$stable << 15) | 12587392, 66);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    public static final void UploadFileQuestion(androidx.compose.ui.h hVar, final SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer answer, final Ia.l<? super Answer, p293xa.r> onAnswer, Ia.l<? super AnswerClickData, p293xa.r> lVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(questionModel, "questionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        C1086g c1086gP = interfaceC1084f.p(1688907441);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        Ia.l<? super AnswerClickData, p293xa.r> d10 = (i11 & 16) != 0 ? new D(6) : lVar;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVarM439getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$UploadFileQuestionKt.INSTANCE.m439getLambda1$intercom_sdk_base_release() : pVar;
        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1739158412, new AnonymousClass2(hVar2, pVarM439getLambda1$intercom_sdk_base_release, answer2, questionModel, d10, onAnswer, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), c1086gP), c1086gP, 12582912, 127);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final Answer answer3 = answer2;
            final Ia.l<? super AnswerClickData, p293xa.r> lVar2 = d10;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVarM439getLambda1$intercom_sdk_base_release;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.w
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return UploadFileQuestionKt.UploadFileQuestion$lambda$1(hVar3, questionModel, answer3, onAnswer, lVar2, pVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadFileQuestion$lambda$0(AnswerClickData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadFileQuestion$lambda$1(androidx.compose.ui.h hVar, SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer answer, Ia.l onAnswer, Ia.l lVar, Ia.p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(questionModel, "$questionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        UploadFileQuestion(hVar, questionModel, answer, onAnswer, lVar, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void UploadFileQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(21672603);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadFileQuestionKt.INSTANCE.m440getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2279f0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadFileQuestionPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UploadFileQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
