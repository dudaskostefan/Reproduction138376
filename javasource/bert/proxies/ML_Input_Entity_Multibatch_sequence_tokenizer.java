// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bert.proxies;

public class ML_Input_Entity_Multibatch_sequence_tokenizer implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BERT.ML_Input_Entity_Multibatch_sequence_tokenizer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Input_ids("Input_ids"),
		Attention_mask("Attention_mask"),
		Token_type_ids("Token_type_ids");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ML_Input_Entity_Multibatch_sequence_tokenizer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ML_Input_Entity_Multibatch_sequence_tokenizer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject)
	{
		if (mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject = mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static bert.proxies.ML_Input_Entity_Multibatch_sequence_tokenizer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bert.proxies.ML_Input_Entity_Multibatch_sequence_tokenizer(context, mendixObject);
	}

	public static bert.proxies.ML_Input_Entity_Multibatch_sequence_tokenizer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bert.proxies.ML_Input_Entity_Multibatch_sequence_tokenizer.initialize(context, mendixObject);
	}

	/**
	 * @return value of Input_ids
	 */
	public final java.lang.String getInput_ids()
	{
		return getInput_ids(getContext());
	}

	/**
	 * @param context
	 * @return value of Input_ids
	 */
	public final java.lang.String getInput_ids(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Input_ids.toString());
	}

	/**
	 * Set value of Input_ids
	 * @param input_ids
	 */
	public final void setInput_ids(java.lang.String input_ids)
	{
		setInput_ids(getContext(), input_ids);
	}

	/**
	 * Set value of Input_ids
	 * @param context
	 * @param input_ids
	 */
	public final void setInput_ids(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String input_ids)
	{
		getMendixObject().setValue(context, MemberNames.Input_ids.toString(), input_ids);
	}

	/**
	 * @return value of Attention_mask
	 */
	public final java.lang.String getAttention_mask()
	{
		return getAttention_mask(getContext());
	}

	/**
	 * @param context
	 * @return value of Attention_mask
	 */
	public final java.lang.String getAttention_mask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attention_mask.toString());
	}

	/**
	 * Set value of Attention_mask
	 * @param attention_mask
	 */
	public final void setAttention_mask(java.lang.String attention_mask)
	{
		setAttention_mask(getContext(), attention_mask);
	}

	/**
	 * Set value of Attention_mask
	 * @param context
	 * @param attention_mask
	 */
	public final void setAttention_mask(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attention_mask)
	{
		getMendixObject().setValue(context, MemberNames.Attention_mask.toString(), attention_mask);
	}

	/**
	 * @return value of Token_type_ids
	 */
	public final java.lang.String getToken_type_ids()
	{
		return getToken_type_ids(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_type_ids
	 */
	public final java.lang.String getToken_type_ids(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Token_type_ids.toString());
	}

	/**
	 * Set value of Token_type_ids
	 * @param token_type_ids
	 */
	public final void setToken_type_ids(java.lang.String token_type_ids)
	{
		setToken_type_ids(getContext(), token_type_ids);
	}

	/**
	 * Set value of Token_type_ids
	 * @param context
	 * @param token_type_ids
	 */
	public final void setToken_type_ids(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String token_type_ids)
	{
		getMendixObject().setValue(context, MemberNames.Token_type_ids.toString(), token_type_ids);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mL_Input_Entity_Multibatch_sequence_tokenizerMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final bert.proxies.ML_Input_Entity_Multibatch_sequence_tokenizer that = (bert.proxies.ML_Input_Entity_Multibatch_sequence_tokenizer) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
