package se.sleepdev.ecommerce;

import se.sleepdev.ecommerce.model.*;
import se.sleepdev.ecommerce.service.*;

public final class EcommerceManager {


	private final ProdRep productRepository;
	private final UserRep userRepository;

	public EcommerceManager(ProdRep productRepository, UserRep userRepository)
	{
		this.productRepository = productRepository;
		this.userRepository = userRepository;
	}

	public Product addProduct(final Product product) throws RepositryException
	{
		if (product.getProductId() == Product.EMPTY_PRODUCT_ID)
		{
			try
			{
				return productRepository.addProduct(product);
			}
			catch (RepositryException e)
			{
				throw new RepositryException("could not add product", e);
			}
		}
		throw new RepositryException("could not add product");
	}

	public final Product getProduct(int productId) throws RepositryException
	{
		try
		{
			return productRepository.getProduct(productId);
		}
		catch (RepositryException e)
		{
			throw new RepositryException("could not get product", e);
		}

	}

	public final Product removeProduct(int productId) throws RepositryException
	{
		try
		{
			return productRepository.removeProduct(productId);
		}
		catch (RepositryException e)
		{
			throw new RepositryException("could not remove product", e);
		}

	}

	public final Product updateProduct(int productId) throws RepositryException
	{
		try
		{
			return productRepository.updateProduct(productId);
		}
		catch (RepositryException e)
		{
			throw new RepositryException("could not update product", e);
		}

	}

	public final User getUser(int userId) throws RepositryException
	{
		try
		{
			return userRepository.getUser(userId);
		}
		catch (RepositryException e)
		{
			throw new RepositryException("could not get user", e);
		}
	}

	public final User updateUser(int userId) throws RepositryException
	{
		try
		{
			return userRepository.updateUser(userId);
		}
		catch (RepositryException e)
		{
			throw new RepositryException("could not update user", e);
		}
	}

	public final User removeUser(int userId) throws RepositryException
	{
		try
		{
			return userRepository.removeUser(userId);
		}
		catch (RepositryException e)
		{
			throw new RepositryException("could not remove user", e);
		}
	}

	public final User addUser(User user) throws RepositryException
	{
		if (user.getUserId() == User.EMPTY_USER_ID)
		{
			try
			{
				return userRepository.addUser(user);
			}
			catch (RepositryException e)
			{
				throw new RepositryException("could not add user", e);
			}
		}
		throw new RepositryException("could not add user");
	}

}
