// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bert.proxies;

public class PredictResponse implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject predictResponseMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BERT.PredictResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Answer("Answer"),
		EmbeddingString("EmbeddingString");

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

	public PredictResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected PredictResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject predictResponseMendixObject)
	{
		if (predictResponseMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, predictResponseMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.predictResponseMendixObject = predictResponseMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static bert.proxies.PredictResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bert.proxies.PredictResponse(context, mendixObject);
	}

	public static bert.proxies.PredictResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bert.proxies.PredictResponse.initialize(context, mendixObject);
	}

	/**
	 * @return value of Answer
	 */
	public final java.lang.String getAnswer()
	{
		return getAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of Answer
	 */
	public final java.lang.String getAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Answer.toString());
	}

	/**
	 * Set value of Answer
	 * @param answer
	 */
	public final void setAnswer(java.lang.String answer)
	{
		setAnswer(getContext(), answer);
	}

	/**
	 * Set value of Answer
	 * @param context
	 * @param answer
	 */
	public final void setAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String answer)
	{
		getMendixObject().setValue(context, MemberNames.Answer.toString(), answer);
	}

	/**
	 * @return value of EmbeddingString
	 */
	public final java.lang.String getEmbeddingString()
	{
		return getEmbeddingString(getContext());
	}

	/**
	 * @param context
	 * @return value of EmbeddingString
	 */
	public final java.lang.String getEmbeddingString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmbeddingString.toString());
	}

	/**
	 * Set value of EmbeddingString
	 * @param embeddingstring
	 */
	public final void setEmbeddingString(java.lang.String embeddingstring)
	{
		setEmbeddingString(getContext(), embeddingstring);
	}

	/**
	 * Set value of EmbeddingString
	 * @param context
	 * @param embeddingstring
	 */
	public final void setEmbeddingString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String embeddingstring)
	{
		getMendixObject().setValue(context, MemberNames.EmbeddingString.toString(), embeddingstring);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return predictResponseMendixObject;
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
			final bert.proxies.PredictResponse that = (bert.proxies.PredictResponse) obj;
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
