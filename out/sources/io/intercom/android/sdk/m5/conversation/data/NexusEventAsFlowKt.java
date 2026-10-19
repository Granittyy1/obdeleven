package io.intercom.android.sdk.m5.conversation.data;

import Aa.c;
import Ia.p;
import com.google.android.gms.internal.measurement.M1;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import io.intercom.android.nexus.EventData;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Avatar;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.InterfaceC2686c;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: NexusEventAsFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NexusEventAsFlowKt {

    /* JADX INFO: compiled from: NexusEventAsFlow.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationPartToken.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: NexusEventAsFlow.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1", f = "NexusEventAsFlow.kt", l = {R.styleable.AppCompatTheme_colorAccent}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<n<? super ParsedNexusEvent>, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ NexusClient $nexusClient;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NexusClient nexusClient, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$nexusClient = nexusClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invokeSuspend$lambda$0(NexusClient nexusClient, NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1) {
            nexusClient.removeEventListener(nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
            return r.f47939a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nexusClient, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.nexus.NexusListener, io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final n nVar = (n) this.L$0;
                final ?? r10 = new NexusListener() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1
                    @Override // io.intercom.android.nexus.NexusListener
                    public void notifyEvent(NexusEvent nexusEvent) {
                        i.e(nexusEvent, "nexusEvent");
                        Objects.toString(nexusEvent.getEventType());
                        Objects.toString(nexusEvent.getEventData());
                        nVar.n(NexusEventAsFlowKt.asNexusData(nexusEvent));
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onConnect() {
                        nVar.n(ParsedNexusEvent.NexusConnected.INSTANCE);
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onShutdown() {
                        nVar.getChannel().a(null);
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onConnectFailed() {
                    }
                };
                this.$nexusClient.addEventListener(r10);
                final NexusClient nexusClient = this.$nexusClient;
                Ia.a aVar = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.data.b
                    @Override // Ia.a
                    public final Object invoke() {
                        return NexusEventAsFlowKt.AnonymousClass1.invokeSuspend$lambda$0(nexusClient, r10);
                    }
                };
                this.label = 1;
                if (l.a(nVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(n<? super ParsedNexusEvent> nVar, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(nVar, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.collections.builders.ListBuilder] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    public static final ParsedNexusEvent asNexusData(NexusEvent nexusEvent) throws JSONException {
        ?? I10;
        NexusEventType eventType = nexusEvent.getEventType();
        int i10 = eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i10 == 1) {
            String strOptString = nexusEvent.getEventData().optString("conversationId");
            i.d(strOptString, "optString(...)");
            String strOptString2 = nexusEvent.getEventData().optString("createdByUserId");
            i.d(strOptString2, "optString(...)");
            Avatar.Builder builderWithImageUrl = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar"));
            AvatarShape.Companion companion = AvatarShape.Companion;
            String strOptString3 = nexusEvent.getEventData().optString("avatarShape");
            i.d(strOptString3, "optString(...)");
            Avatar avatarBuild = builderWithImageUrl.withShape(companion.fromName(strOptString3)).build();
            i.d(avatarBuild, "build(...)");
            EventData eventData = nexusEvent.getEventData();
            i.d(eventData, "getEventData(...)");
            Object objSafeGetOrDefault = safeGetOrDefault(eventData, "isBot", Boolean.FALSE);
            i.c(objSafeGetOrDefault, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) objSafeGetOrDefault).booleanValue();
            EventData eventData2 = nexusEvent.getEventData();
            i.d(eventData2, "getEventData(...)");
            Object objSafeGetOrDefault2 = safeGetOrDefault(eventData2, "showAvatar", Boolean.TRUE);
            i.c(objSafeGetOrDefault2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) objSafeGetOrDefault2).booleanValue();
            String strOptString4 = nexusEvent.getEventData().optString("clientId");
            i.d(strOptString4, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping(strOptString, strOptString2, avatarBuild, zBooleanValue, zBooleanValue2, strOptString4);
        }
        if (i10 == 2) {
            String strOptString5 = nexusEvent.getEventData().optString("conversationId");
            i.d(strOptString5, "optString(...)");
            String strOptString6 = nexusEvent.getEventData().optString("createdByUserId");
            i.d(strOptString6, "optString(...)");
            Avatar avatarBuild2 = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar")).build();
            i.d(avatarBuild2, "build(...)");
            EventData eventData3 = nexusEvent.getEventData();
            i.d(eventData3, "getEventData(...)");
            Object objSafeGetOrDefault3 = safeGetOrDefault(eventData3, "isBot", Boolean.FALSE);
            i.c(objSafeGetOrDefault3, "null cannot be cast to non-null type kotlin.Boolean");
            return new ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin(strOptString5, strOptString6, avatarBuild2, ((Boolean) objSafeGetOrDefault3).booleanValue());
        }
        if (i10 == 3) {
            String strOptString7 = nexusEvent.getEventData().optString("conversationId");
            i.d(strOptString7, "optString(...)");
            String strOptString8 = nexusEvent.getEventData().optString("createdByUserId");
            i.d(strOptString8, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.NewComment(strOptString7, strOptString8, nexusEvent.getEventData().optString("ticketId"));
        }
        if (i10 != 4) {
            return ParsedNexusEvent.UnSupportedEvent.INSTANCE;
        }
        Object obj = nexusEvent.getEventData().get("blocks");
        i.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) obj;
        try {
            String string = jSONArray.toString();
            i.d(string, "toString(...)");
            Type type = new L7.a<ArrayList<Block.Builder>>() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$asNexusData$blocks$type$1
            }.getType();
            i.d(type, "getType(...)");
            ArrayList arrayList = (ArrayList) new Gson().c(new StringReader(string), L7.a.get(type));
            i.b(arrayList);
            I10 = new ArrayList(m.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                I10.add(((Block.Builder) it.next()).build());
            }
        } catch (JsonSyntaxException unused) {
            ListBuilder listBuilderF = M1.f();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj2 = jSONArray.get(i11);
                i.c(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                Block blockBuild = new Block.Builder().withType(jSONObject.optString("type")).withText(jSONObject.optString(AttributeType.TEXT)).build();
                i.d(blockBuild, "build(...)");
                listBuilderF.add(blockBuild);
            }
            I10 = listBuilderF.I();
        }
        ?? r15 = I10;
        String strOptString9 = nexusEvent.getEventData().optString("conversationId");
        i.d(strOptString9, "optString(...)");
        String strOptString10 = nexusEvent.getEventData().optString("clientAssignedUuid");
        i.d(strOptString10, "optString(...)");
        String strOptString11 = nexusEvent.getEventData().optString("partType");
        i.d(strOptString11, "optString(...)");
        Object obj3 = nexusEvent.getEventData().get("tokenSequenceIndex");
        i.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        return new ParsedNexusEvent.ConversationNexusEvent.FinStreaming(strOptString9, strOptString10, strOptString11, ((Integer) obj3).intValue(), r15);
    }

    public static final InterfaceC2686c<ParsedNexusEvent> nexusEventAsFlow(NexusClient nexusClient) {
        i.e(nexusClient, "nexusClient");
        return new CallbackFlowBuilder(new AnonymousClass1(nexusClient, null), EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
    }

    private static final Object safeGetOrDefault(EventData eventData, String str, Object obj) {
        Object orDefault = eventData.getOrDefault(str, obj);
        i.b(orDefault);
        return orDefault;
    }
}
